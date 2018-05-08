package edu.matc.controller;

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
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/updateUser2"}
)

public class UpdateUser2 extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);

        String idUser = req.getParameter("id");
        int id = Integer.parseInt(idUser);

        HttpSession session = req.getSession();
        session.setAttribute("userId", userDao.getById(id));

        RequestDispatcher view = req.getRequestDispatcher("updateUser.jsp");
        view.forward(req, resp);

    }
}
