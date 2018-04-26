package edu.matc.persistence;

import edu.matc.entity.Book;
import edu.matc.entity.ReturnBook;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The type Issue book dao test.
 */
public class ReturnBookDaoTest {

    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(ReturnBook.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        List<ReturnBook> returnBooks = genericDao.getAll();
        assertEquals(2, returnBooks.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        ReturnBook retrievedOrder = (ReturnBook) genericDao.getById(1);
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
        ReturnBook newReturnBook = new ReturnBook("jcoyne@gmail.com", "354-453-4534", "Joe Coyne", "78626587510", user);
        user.addReturnBook(newReturnBook);

        // test
        int id = genericDao.insert(newReturnBook);
        assertNotEquals(0,id);
        ReturnBook insertedReturnBook = (ReturnBook) genericDao.getById(id);
        assertEquals("jcoyne@gmail.com", insertedReturnBook.getEmail());
        assertNotNull(insertedReturnBook.getUser());
        assertEquals("jcoyne", insertedReturnBook.getUser().getUserName());

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
        ReturnBook returnBookToUpdate = (ReturnBook)genericDao.getById(2);
        returnBookToUpdate.setPhone(phone);
        genericDao.saveOrUpdate(returnBookToUpdate);
        ReturnBook retrievedReturnBook = (ReturnBook)genericDao.getById(2);
        assertEquals(returnBookToUpdate, retrievedReturnBook);
    }


    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<ReturnBook> returnBooks = genericDao.getByPropertyEqual("phone", "608-353-3501");
        assertEquals(1, returnBooks.size());
        assertEquals(1, returnBooks.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<ReturnBook> returnBooks = genericDao.getByPropertyLike("phone", "608");
        assertEquals(2, returnBooks.size());
    }


}
