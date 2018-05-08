package edu.matc.persistence;

import edu.matc.entity.Book;
import org.jsoup.Jsoup;
import org.junit.jupiter.api.BeforeEach;
import org.jsoup.nodes.Document;

import java.io.IOException;

import static javax.ws.rs.core.HttpHeaders.USER_AGENT;

public class GoogleBookSearchTest {

        private Document doc;

        Book book;
        String search;

        @BeforeEach
        void setUp() throws IOException {
            book = new Book();
            doc = Jsoup.connect("https://www.google.com/search?hl=en&site=imghp&tbm=isch&source=hp&q="+search).userAgent(USER_AGENT).get();
        }


}
