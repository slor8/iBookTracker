package edu.matc.controller;

import edu.matc.entity.Book;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/addBook"}
)

public class AddBook extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    /**
        Book book = new Book();
        GenericDao bookDao = new GenericDao(Book.class);


        book.setTitle(req.getParameter("title"));
        book.setAuthor(req.getParameter("author"));
        book.setIsbn(req.getParameter("isbn"));

        bookDao.insert(book);

    **/
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addBook.jsp");
        dispatcher.forward(req, resp);

    }
}
