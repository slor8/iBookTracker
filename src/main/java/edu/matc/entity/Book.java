package edu.matc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.persistence.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static javax.ws.rs.core.HttpHeaders.USER_AGENT;

@Entity(name = "Book")
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String title;


    @ManyToOne      // foreign key to User
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "book_user_fk")
    )
    private User user;


    public Book() {
    }

    public Book(User user, String title) {
        this.user = user;
        this.title = title;

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    @JsonIgnore
    public List<String> BookSearch(String search) {

        List<String> bookList = new ArrayList<String>();

        Document doc;

        try {

            doc = Jsoup.connect("https://www.google.com/search?tbm=bks&q="+search).userAgent(USER_AGENT).get();

            Elements books = doc.select("img");

            for (Element book : books) {

                bookList.add(book.attr("src"));
            }


        } catch (IOException error) {

            error.printStackTrace();
        }

        return bookList;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title);
    }
}
