package edu.matc.controller;

import edu.matc.entity.Book;
import edu.matc.entity.ReturnBook;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (
        urlPatterns = {"/checkOutBook"}
)

public class CheckOutBook extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        GenericDao bookDao = new GenericDao(Book.class);
        GenericDao issueBookDao = new GenericDao(ReturnBook.class);
        ReturnBook returnBook = new ReturnBook();





        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String name = req.getParameter("name");
        String isbn = req.getParameter("isbn");



        RequestDispatcher dispatcher = req.getRequestDispatcher("/issueBookSuccess.jsp");
        dispatcher.forward(req, resp);

    }
}
