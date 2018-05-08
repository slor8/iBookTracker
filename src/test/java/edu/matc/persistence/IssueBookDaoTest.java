package edu.matc.persistence;

import edu.matc.entity.IssueBook;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The type Issue book dao test.
 */
public class IssueBookDaoTest {

    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(IssueBook.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        List<IssueBook> issueBooks = genericDao.getAll();
        assertEquals(2, issueBooks.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        IssueBook retrievedOrder = (IssueBook) genericDao.getById(1);
        assertNotNull(retrievedOrder);
        assertEquals("jcoyne@gmail.com", retrievedOrder.getEmail());
    }

    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        GenericDao userDao = new GenericDao(User.class);

        User user = (User)userDao.getById(1);
        IssueBook newIssueBook = new IssueBook("jcoyne@gmail.com", "354-453-4534", "Joe Coyne", "78626587510", user);
        user.addReturnBook(newIssueBook);

        // test
        int id = genericDao.insert(newIssueBook);
        assertNotEquals(0,id);
        IssueBook insertedIssueBook = (IssueBook) genericDao.getById(id);
        assertEquals("jcoyne@gmail.com", insertedIssueBook.getEmail());
        assertNotNull(insertedIssueBook.getUser());
        assertEquals("jcoyne", insertedIssueBook.getUser().getUserName());

    }

    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(1));
        assertNull(genericDao.getById(1));
    }

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String phone = "999-999-9999";
        IssueBook issueBookToUpdate = (IssueBook)genericDao.getById(2);
        issueBookToUpdate.setPhone(phone);
        genericDao.saveOrUpdate(issueBookToUpdate);
        IssueBook retrievedIssueBook = (IssueBook)genericDao.getById(2);
        assertEquals(issueBookToUpdate, retrievedIssueBook);
    }


    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<IssueBook> issueBooks = genericDao.getByPropertyEqual("phone", "608-353-3501");
        assertEquals(1, issueBooks.size());
        assertEquals(1, issueBooks.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<IssueBook> issueBooks = genericDao.getByPropertyLike("phone", "608");
        assertEquals(2, issueBooks.size());
    }


}
