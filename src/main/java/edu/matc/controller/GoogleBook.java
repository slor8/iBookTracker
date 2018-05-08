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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = "/searchBooks"
)

public class GoogleBook extends HttpServlet {

    Book books = new Book();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

        String search = request.getParameter("searchBook");

        GenericDao bookDao = new GenericDao(Book.class);
        GenericDao userDao = new GenericDao(User.class);
        Book book = new Book();

        List<User> userList = userDao.getUserID(request.getRemoteUser());
        int userId = userList.get(0).getId();
        User userSearch;
        userSearch = (User)userDao.getById(userId);

        List<String> bookListSrc = books.BookSearch(search);

        HttpSession session = request.getSession();
        session.setAttribute("search", search);
        session.setAttribute("bookListSrc", bookListSrc);


        book.setTitle(search);
        book.setUser(userSearch);

        bookDao.insert(book);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/searchResults.jsp");
        dispatcher.forward(request, response);
    }

}
