package edu.matc.controller;

import edu.matc.entity.IssueBook;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/viewIssueBook"}
)
public class ViewIssueBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao issueBookDao = new GenericDao(IssueBook.class);

        req.setAttribute("issueBooks", issueBookDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewIssueBook.jsp");
        dispatcher.forward(req, resp);

    }
}
