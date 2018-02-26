package edu.matc.persistence;

import edu.matc.entity.Book;
import edu.matc.entity.User;
import edu.matc.entity.Borrow;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        genericDao = new GenericDao(User.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all users success.
     */
    @Test
    void getAllUsersSuccess() {

        List<User> users = genericDao.getAll();
        assertEquals(6, users.size());
    }

    /**
     * Gets users by user last name success.
     */
    @Test
    void getUsersByUserLastNameSuccess() {

        List<User> users = genericDao.getUsersByUserLastName("I");
        assertEquals(2, users.size());

    }

    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = genericDao.getByPropertyLike("firstName", "e");
        assertEquals(5, users.size());

    }

    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = genericDao.getByPropertyEqual("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }

    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        User newUser = new User("Fred", "Flintstone", "fflintstone", "password");

        int id = genericDao.insert(newUser);

        assertNotEquals(0, id);

        User insertedUser = (User)genericDao.getById(id);

        assertEquals("Fred", insertedUser.getFirstName());
    }


    /**
     * Insert success.
     */
    @Test
    void insertWithBorrowSuccess() {

        User newUser = new User("Ryan", "Flintston", "rflintstone", "password");
        Book newBook = new Book("The Hunger Games", "Suzanne Collins", "978-0-439-02352-8");

        String userContact = "608-534-4534";
        Borrow borrow = new Borrow(userContact, newUser, newBook);

        newUser.addBorrow(borrow);

        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User)genericDao.getById(id);
        assertEquals("Ryan", insertedUser.getFirstName());
        assertEquals(1, insertedUser.getBorrows().size());
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
        String newLastName = "Wright";
        User userToUpdate = (User)genericDao.getById(3);
        userToUpdate.setLastName(newLastName);
        genericDao.saveOrUpdate(userToUpdate);
        User retrievedUser = (User)genericDao.getById(3);
        assertEquals(userToUpdate, retrievedUser);

    }

}