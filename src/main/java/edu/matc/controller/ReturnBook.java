package edu.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/returnBook"}
)

public class ReturnBook extends HttpServlet{

    protected void doGet(HttpServletResponse req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
