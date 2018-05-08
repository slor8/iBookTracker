package edu.matc.controller;

import edu.matc.entity.IssueBook;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/checkOutBook"}
)
public class CheckOutBook extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);

        GenericDao issueBookDao = new GenericDao(IssueBook.class);
        IssueBook issueBook = new IssueBook();

        List<User> userList = userDao.getUserID(req.getRemoteUser());
        int userId = userList.get(0).getId();
        User userBook;
        userBook = (User)userDao.getById(userId);

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String title = req.getParameter("title");

        issueBook.setFullName(name);
        issueBook.setEmail(email);
        issueBook.setPhone(phone);
        issueBook.setTitle(title);
        issueBook.setUser(userBook);

        issueBookDao.insert(issueBook);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/issueBookSuccess.jsp");
        dispatcher.forward(req, resp);

    }
}
