package edu.matc.persistence;

import edu.matc.entity.IssueBook;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    /**
     * The Dao.
     */
    UserDao dao;

    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        dao = new UserDao();
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

    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        User newUser = new User("See", "Lor", "seeLor@gmail.com", "454-565-5645", "Slor");

        int id = genericDao.insert(newUser);

        assertNotEquals(0, id);

        User insertedUser = (User)genericDao.getById(id);

        assertEquals("See", insertedUser.getFirstName());
    }


    /**
     * Insert success.
     */
    @Test
    void insertWithIssueBookSuccess() {

        User newUser = new User("See", "Lor", "seeLor@gmail.com", "233-3434-4534 ", "Slor");

        String bookISBN = "454-0-65-563445-0";
        String name = "Slor";
        String phone = "454-565-5645";
        IssueBook issueBook = new IssueBook(bookISBN,name,phone,newUser);

        newUser.addIssueBook(issueBook);

        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = dao.getById(id);
        assertEquals("See", insertedUser.getFirstName());
        assertEquals(1, insertedUser.getIssueBooks().size());
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