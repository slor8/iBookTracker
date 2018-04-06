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

        String userId = req.getParameter("id");
        //int id = Integer.parseInt(userId);

        String name = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        user.setFirstName(name);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setPassword(password);

        userDao.insert(user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addUserSuccess.jsp");
        dispatcher.forward(req, resp);





    }
}
