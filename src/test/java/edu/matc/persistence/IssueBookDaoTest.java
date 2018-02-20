package edu.matc.persistence;

import edu.matc.entity.IssueBook;
import edu.matc.entity.IssueBook;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type IssueBook dao test.
 */
class IssueBookDaoTest {

    /**
     * The Dao.
     */
    IssueBookDao dao;

    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        dao = new IssueBookDao();
        genericDao = new GenericDao(IssueBook.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all issueBooks success.
     */
    @Test
    void getAllIssueBooksSuccess() {

        List<IssueBook> issueBooks = genericDao.getAll();
        assertEquals(3, issueBooks.size());
    }


    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        UserDao userDao = new UserDao();
        User user = userDao.getById(1);
        IssueBook newIssueBook = new IssueBook("424-0-65-594405-2", "Jconye", "112-343-3423", user);
        user.addIssueBook(newIssueBook);

        int id = dao.insert(newIssueBook);

        assertNotEquals(0, id);

        IssueBook insertedIssueBook = dao.getById(id);

        assertEquals("Jconye", insertedIssueBook.getUser_Name());
        assertNotNull(insertedIssueBook.getUser());
        assertEquals("Joe", insertedIssueBook.getUser().getFirstName());
    }


    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {

        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    @Test
    void updateSucess() {
        String isbn = "999-9-99-999999-9";
        IssueBook issueBookToUpdate = dao.getById(3);
        issueBookToUpdate.setIsbn(isbn);
        genericDao.saveOrUpdate(issueBookToUpdate);
        IssueBook retrievedUser = dao.getById(3);
        assertEquals(issueBookToUpdate, retrievedUser);

    }

}