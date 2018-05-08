package edu.matc.controller;

import edu.matc.entity.BookParser;

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
        urlPatterns = "/searchBooks"
)

public class GoogleBook extends HttpServlet {

    BookParser imageParse = new BookParser();

    private String url = "/searchResults.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

        String googleSearch = request.getParameter("imageName");

        List<String> imgArraySrc = imageParse.MultipleImageSearch(googleSearch);
        String imgSrc = imageParse.ImageSearch(googleSearch);


        HttpSession session = request.getSession();
        session.setAttribute("searchItem", googleSearch);
        session.setAttribute("imgArraySrc", imgArraySrc);
        session.setAttribute("imgSrc", imgSrc);


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}
