package edu.matc.persistence;

import edu.matc.entity.Book;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Book dao test.
 */
class BookDaoTest {

    /**
     * The Generic dao.
     */
    GenericDao genericDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        genericDao = new GenericDao(Book.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all books success.
     */
    @Test
    void getAllBooksSuccess() {

        List<Book> books = genericDao.getAll();
        assertEquals(3, books.size());
    }

    /**
     * Gets books by book last name success.
     *
     * @Test void getBooksByBookLastNameSuccess() {List<Book> books = genericDao.getBooksByBookLastName("I");assertEquals(2, books.size());}
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Book> books = genericDao.getByPropertyLike("author", "e");
        assertEquals(3, books.size());

    }

    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Book> books = genericDao.getByPropertyEqual("author", "E. B. White");
        assertEquals(1, books.size());
        assertEquals(1, books.get(0).getId());
    }

    /**
     * Insert success.
     */
    @Test
    void insertBookSuccess() {

        GenericDao userDao = new GenericDao(User.class);

        User user = (User)userDao.getById(1);
        Book newBook = new Book("Head First PHP & MySQL", "Lynn Beighley & Michael Morrison", "978-0-596-00630-3", user);
        user.addBook(newBook);

        int id = genericDao.insert(newBook);

        assertNotEquals(0, id);

        Book insertedBook = (Book)genericDao.getById(id);

        assertEquals("Head First PHP & MySQL", insertedBook.getTitle());
        assertNotNull(insertedBook.getUser());
        assertEquals("Joe", insertedBook.getUser().getFirstName());
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
     * Update sucess.
     */
    @Test
    void updateSucess() {
        String newLastName = "Wright";
        Book bookToUpdate = (Book)genericDao.getById(3);
        bookToUpdate.setAuthor(newLastName);
        genericDao.saveOrUpdate(bookToUpdate);
        Book retrievedBook = (Book)genericDao.getById(3);
        assertEquals(bookToUpdate, retrievedBook);
    }

}