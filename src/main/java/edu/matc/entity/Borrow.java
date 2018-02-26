package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Borrow")
@Table(name = "borrow")
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String contact_number;

    // borrow_date and return_date

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

    public Borrow() {
    }

    public Borrow(String contact_number, User user, Book book) {
        this.contact_number = contact_number;
        this.user = user;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", contact_number='" + contact_number + '\'' +
                ", user=" + user +
                ", book=" + book +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Borrow borrow = (Borrow) o;
        return id == borrow.id &&
                Objects.equals(user, borrow.user) &&
                Objects.equals(book, borrow.book) &&
                Objects.equals(contact_number, borrow.contact_number);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, user, book, contact_number);
    }
}