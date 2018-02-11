package edu.matc.persistence;

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

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        dao = new UserDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all users success.
     */
    @Test
    void getAllUsersSuccess() {

        List<User> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }

    /**
     * Gets users by user last name success.
     */
    @Test
    void getUsersByUserLastNameSuccess() {

        List<User> users = dao.getUsersByUserLastName("I");
        assertEquals(2, users.size());

    }

    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        User newUser = new User("See", "Lor", "seeLor@gmail.com", "454-565-5645", "Slor");

        int id = dao.insert(newUser);

        assertNotEquals(0, id);

        User insertedUser = dao.getById(id);

        assertEquals("See", insertedUser.getFirstName());
    }


    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {

        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }

}