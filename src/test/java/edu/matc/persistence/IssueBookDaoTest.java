package edu.matc.persistence;

import edu.matc.entity.Book;
import edu.matc.entity.IssueBook;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class IssueBookDaoTest {

    GenericDao genericDao;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(IssueBook.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getAllSuccess() {
        List<IssueBook> issueBooks = genericDao.getAll();
        assertEquals(3, issueBooks.size());
    }

    @Test
    void getByIdSuccess() {
        IssueBook retrievedOrder = (IssueBook) genericDao.getById(2);
        assertNotNull(retrievedOrder);
        assertEquals("jcoyne@gmail.com", retrievedOrder.getEmail());
    }

    @Test
    void insertSuccess() {

        GenericDao bookDao = new GenericDao(Book.class);

         Book book = (Book)bookDao.getById(1);
         IssueBook newIssueBook = new IssueBook("dklein@gmail.com", "354-453-4534", "Dianne Klein", book);
         book.addIssueBook(newIssueBook);

         int id = genericDao.insert(newIssueBook);

         assertNotEquals(0,id);

         IssueBook insertedIssueBook = (IssueBook) genericDao.getById(id);

         assertEquals("dklein@gmail.com", insertedIssueBook.getEmail());
         assertNotNull(insertedIssueBook.getBook());
         assertEquals("Charlotte's Web", insertedIssueBook.getBook().getTitle());

    }

    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    @Test
    void updateSuccess() {
        String phone = "999-999-9999";
        IssueBook issueBookToUpdate = (IssueBook)genericDao.getById(3);
        issueBookToUpdate.setPhone(phone);
        genericDao.saveOrUpdate(issueBookToUpdate);
        IssueBook retrievedIssueBook = (IssueBook)genericDao.getById(3);
        assertEquals(issueBookToUpdate, retrievedIssueBook);
    }


    @Test
    void getByPropertyEqualSuccess() {
        List<IssueBook> issueBooks = genericDao.getByPropertyEqual("phone", "608-354-4453");
        assertEquals(1, issueBooks.size());
        assertEquals(1, issueBooks.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<IssueBook> issueBooks = genericDao.getByPropertyLike("phone", "608");
        assertEquals(3, issueBooks.size());
    }


}
