package edu.matc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import edu.matc.entity.Book;
import edu.matc.entity.BookParser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Path("/book")
public class GoogleBookRestService {

    @GET
    @Path("/{param}")
    @Produces("application/json")
    public Response getImages(@PathParam("param") String msg) throws IOException {

        //instantiate the parser class
        BookParser htmlImageParser = new BookParser();

        String imgSrc = htmlImageParser.ImageSearch(msg);

        Set<String> imageSet;

        imageSet = new HashSet<String>(Arrays.asList(msg, imgSrc));

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String arrayToJson = objectMapper.writeValueAsString(imageSet);

        return Response.status(200).entity(arrayToJson).build();

    }

    @GET
    @Path("multiple/{param}")
    @Produces("application/json")
    public Response getMultipleImages(@PathParam("param") String msg) throws IOException {

        //instantiate the parser class
        BookParser htmlImageParser = new BookParser();

        List<String> imgSrc = htmlImageParser.MultipleImageSearch(msg);


        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String arrayToJson = objectMapper.writeValueAsString(imgSrc);

        return Response.status(200).entity(arrayToJson).build();

    }
}
