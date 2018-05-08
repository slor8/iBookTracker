package edu.matc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import edu.matc.entity.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

@Path("/bookSearch")
public class GoogleBookRestService {

    @GET
    @Path("query/{param}")
    @Produces("application/json")
    public Response getBookSearch(@PathParam("param") String msg) throws IOException {

        Book books = new Book();

        List<String> imgSrc = books.BookSearch(msg);


        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String arrayToJson = objectMapper.writeValueAsString(imgSrc);

        return Response.status(200).entity(arrayToJson).build();

    }
}
