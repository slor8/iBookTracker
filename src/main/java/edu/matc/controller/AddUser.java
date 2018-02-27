package edu.matc.controller;

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

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
        User user = new User();
        GenericDao userDao = new GenericDao(User.class);
        //UserRole userRole = new UserRoler();
        //GenericDao userRoleDao = new GenericDao(UserRoleDao.class);
        IssueBook issueBook = new IssueBook();
        GenericDao issueBookDao = new GenericDao(IssueBook.class);

        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setPassword(req.getParameter("password"));
        user.setEmail(req.getParameter("email"));
        user.setPhone(req.getParameter("phone"));
        user.setUserName(req.getParameter("userName"));

        userDao.insert(user);
         **/

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addUser.jsp");
        dispatcher.forward(req, resp);




    }
}
