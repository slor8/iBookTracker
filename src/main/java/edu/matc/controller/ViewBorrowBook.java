package edu.matc.controller;

import edu.matc.entity.Borrow;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/viewBorrowBook"}
)

public class ViewBorrowBook extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao borrowDao = new GenericDao(Borrow.class);

        req.setAttribute("borrows", borrowDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewBorrowBook.jsp");
        dispatcher.forward(req, resp);

    }
}
