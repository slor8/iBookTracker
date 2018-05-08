package edu.matc.controller;

import edu.matc.entity.Role;
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
        urlPatterns = {"/addUser"}
)

public class AddUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        User user = new User();
        GenericDao userDao = new GenericDao(User.class);
        GenericDao roleDao = new GenericDao(Role.class);

        String userId = req.getParameter("id");

        String name = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        user.setFirstName(name);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setPassword(password);

        userDao.insert(user);

        Role userRole = new Role(user, userName, role);
        roleDao.insert(userRole);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addUserSuccess.jsp");
        dispatcher.forward(req, resp);


    }
}
