package edu.matc.persistence;

import edu.matc.entity.Book;
import edu.matc.entity.Borrow;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Borrow dao test.
 */
class BorrowDaoTest {

    GenericDao genericDao;


    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        genericDao = new GenericDao(Borrow.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }


    @Test
    void getAllBorrowSuccess() {

        List<Borrow> borrows = genericDao.getAll();
        assertEquals(3, borrows.size());
    }

    @Test
    void insertSuccess() {

        GenericDao userDao = new GenericDao(User.class);
        GenericDao bookDao = new GenericDao(Book.class);

        User user = (User)userDao.getById(1);
        Book book = (Book)bookDao.getById(1);
        Borrow newBorrow = new Borrow("607-324-6454", user, book);
        user.addBorrow(newBorrow);

        int id = genericDao.insert(newBorrow);

        assertNotEquals(0, id);

        Borrow insertedBorrow = (Borrow)genericDao.getById(id);

        assertEquals("607-324-6454", insertedBorrow.getContact_number());
        assertNotNull(insertedBorrow.getUser());
        assertEquals("Joe", insertedBorrow.getUser().getFirstName());

    }




    @Test
    void deleteSuccess() {

        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    @Test
    void updateSucess() {

        String userContact = "651-233-0094";

        Borrow borrowToUpdate = (Borrow)genericDao.getById(3);
        borrowToUpdate.setContact_number(userContact);
        genericDao.saveOrUpdate(borrowToUpdate);
        Borrow retrievedUser = (Borrow)genericDao.getById(3);
        assertEquals(borrowToUpdate, retrievedUser);

    }


}