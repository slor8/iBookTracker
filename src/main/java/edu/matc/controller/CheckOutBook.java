package edu.matc.controller;

import edu.matc.entity.IssueBook;
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

        IssueBook issueBook = new IssueBook();
        GenericDao issueBookDao = new GenericDao(IssueBook.class);

        issueBook.setEmail(req.getParameter("email"));
        issueBook.setPhone(req.getParameter("phone"));
        issueBook.setFullName(req.getParameter("name"));
        issueBook.setIsbn(req.getParameter("isbn"));

        issueBookDao.insert(issueBook);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/issueBookSuccess.jsp");
        dispatcher.forward(req, resp);

    }
}
