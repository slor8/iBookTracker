package edu.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/addBook"}
)

public class AddBook {

    protected void doGet(HttpServletResponse req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
