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

@WebServlet (
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);

        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("users", genericDao.getUsersByUserLastName(req.getParameter("searchTerm")));
        } else {
            req.setAttribute("users", genericDao.getAll());
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");

        dispatcher.forward(req, resp);
    }
}
