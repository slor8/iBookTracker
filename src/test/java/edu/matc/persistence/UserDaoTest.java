package edu.matc.persistence;

import edu.matc.entity.Book;
import edu.matc.entity.Role;
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
     * The Generic dao.
     */
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

    /**
     * Gets by property like success.
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = genericDao.getByPropertyLike("firstName", "e");
        assertEquals(5, users.size());

    }

    /**
     * Gets by property equal success.
     */
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

        // test
        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User)genericDao.getById(id);
        assertEquals("Fred", insertedUser.getFirstName());
    }


    @Test
    void insertWithRoleSuccess() {

        String userName = "admin2";
        User newUser = new User("Admin2", "Admin2", userName, "admin2");


        String roleName = "admin";
        Role role = new Role(newUser, roleName, userName);

        newUser.addRole(role);

        int id = genericDao.insert(newUser);

        assertNotEquals(0, id);
        User insertedUser = (User)genericDao.getById(id);
        assertEquals(newUser, insertedUser);
        assertEquals(1, insertedUser.getRoles().size());


    }


    /**
     * Insert success.
     */
    @Test
    void insertWithBookSuccess() {

        User newUser = new User("Ryan", "Flintston", "rflintstone", "password");

        String bookTitle = "The Hunger Games";
        String bookAuthor = "Suzanne Collins";
        String bookIsbn = "978-0-439-02352-8";
        Book book = new Book(newUser, bookTitle, bookAuthor, bookIsbn);

        newUser.addBook(book);

        int id = genericDao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        assertEquals("Ryan", insertedUser.getFirstName());
        assertEquals(1, insertedUser.getBooks().size());

    }


    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {

        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    /**
     * Update success.
     */
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