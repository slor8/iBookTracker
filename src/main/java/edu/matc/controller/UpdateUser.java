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
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/updateUser"}
)

public class UpdateUser extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User();
        GenericDao userDao = new GenericDao(User.class);

        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setUserName(req.getParameter("userName"));
        user.setPassword(req.getParameter("password"));

        userDao.saveOrUpdate(user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addUserSuccess.jsp");
        dispatcher.forward(req, resp);



    }
}
