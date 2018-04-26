package edu.matc.controller;


import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

public class SearchBookServlet {
    /**
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchBooks.jsp");
        dispatcher.forward(req, resp);
    }

     **/

    JsonFactory jsonFactory = new JacksonFactory();



}


// https://developers.google.com/api-client-library/java/apis/books/v1 -> Search For Book