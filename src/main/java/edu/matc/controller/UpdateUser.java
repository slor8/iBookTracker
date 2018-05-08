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
        urlPatterns = {"/updateUser"}
)
public class UpdateUser extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String userId = req.getParameter("id");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String username = req.getParameter("userName");
        String password = req.getParameter("password");

        try {

            GenericDao<User> userDao = new GenericDao<>(User.class);
            User user = userDao.getById(Integer.valueOf(userId));

            if (firstName != null && firstName.length() > 0) {
                user.setFirstName(firstName);
            }
            if (lastName != null && firstName.length() > 0) {
                user.setLastName(lastName);
            }
            if (username != null && username.length() > 0) {
                user.setUserName(username);
            }
            if (password != null && password.length() > 0) {
                user.setPassword(password);
            }

            log.info(req.getParameter("firstName"));
            log.info(req.getParameter("lastName"));
            log.info(req.getParameter("username"));
            log.info(req.getParameter("password"));

            userDao.saveOrUpdate(user);

        } catch (Exception e) {

            log.error("Error Occurred Updating User Information", e);
        }


        RequestDispatcher view = req.getRequestDispatcher("updateUserSuccess.jsp");
        view.forward(req, resp);

    }
}
