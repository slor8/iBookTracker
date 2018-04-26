package edu.matc.controller;

import edu.matc.entity.Book;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/addBook"}
)

public class AddBook extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        GenericDao bookDao = new GenericDao(Book.class);
        Book book = new Book();

        List<User> userList = userDao.getUserID(req.getRemoteUser());
        int userId = userList.get(0).getId();
        User userBook;
        userBook = (User)userDao.getById(userId);

        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String isbn = req.getParameter("isbn");

        book.setUser(userBook);
        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);

        bookDao.insert(book);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addBookSuccess.jsp");
        dispatcher.forward(req, resp);

    }
}
