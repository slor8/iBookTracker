package edu.matc.controller;

import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/returnBook"}
)

public class ReturnBook extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

        GenericDao issueBookDao = new GenericDao(edu.matc.entity.ReturnBook.class);

        //issueBookDao.getById();

        RequestDispatcher dispatcher = req.getRequestDispatcher("/returnBook.jsp");
        dispatcher.forward(req, resp);

    }

}
