package edu.matc.controller;

import edu.matc.entity.Book;
import edu.matc.entity.IssueBook;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/returnBook"}
)

public class ReturnBook extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao issueBookDao = new GenericDao(IssueBook.class);

        String userId = req.getParameter("id");

        int id = Integer.parseInt(userId);
        issueBookDao.delete(issueBookDao.getById(id));

        resp.sendRedirect("viewIssueBook");
    }

}
