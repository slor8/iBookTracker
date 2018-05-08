package edu.matc.persistence;

import edu.matc.entity.BookParser;
import org.jsoup.Jsoup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static javax.ws.rs.core.HttpHeaders.USER_AGENT;
import static org.junit.jupiter.api.Assertions.*;

public class GoogleBookSearchTest {

        private Document doc;

        BookParser image;
        String search;

        @BeforeEach
        void setUp() throws IOException {
            image = new BookParser();
            doc = Jsoup.connect("https://www.google.com/search?hl=en&site=imghp&tbm=isch&source=hp&q="+search).userAgent(USER_AGENT).get();
        }

        @Test
        void  getImageSuccess() {
            search = "Love";
            Element element = doc.select("img").first();
            assertEquals("https://encrypted.google.com/books?id=wK01LgEACAAJ&printsec=frontcover&img=1&zoom=5&h=75&w=60", image.ImageSearch(search));
        }

}
