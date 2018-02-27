package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet(
        urlPatterns = {"/deleteUser"}
)

public class DeleteUser extends HttpServlet{

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
        String deleteUser = req.getParameter("userCheckBox");
        log.info("userCheckBok value: " + deleteUser);
        String url = "";

        try {
            GenericDao userDao = new GenericDao(User.class);
            userDao.delete(deleteUser);
            List<User> users = userDao.getAll();
            log.info("new list of users after delete: " + users);
            req.setAttribute("users", users);
            url = "viewUser.jsp";

        } catch (HibernateException hibernateEx) {
            HttpSession session = req.getSession();
            log.error("Error deleting user: " + deleteUser, hibernateEx);
            session.setAttribute("ErrorMessage", "Error deleting user: " + deleteUser);

            resp.sendRedirect(url);
        }
         **/

        RequestDispatcher dispatcher = req.getRequestDispatcher("/deleteUser.jsp");
        dispatcher.forward(req, resp);
    }
}
