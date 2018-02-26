package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/viewBook"}
)

public class ViewBook extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //GenericDao userDao = new GenericDao(Book.class);

        //req.setAttribute("users", userDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewBook.jsp");
        dispatcher.forward(req, resp);

    }
}
