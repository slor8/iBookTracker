package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "IssueBook")
@Table(name = "issueBook")
public class IssueBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String email;
    private String phone;

    private String fullName;

    @ManyToOne
    private Book book;

    public IssueBook() {
    }

    public IssueBook(String email, String phone, String fullName, Book book) {
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "IssueBook{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", fullName='" + fullName + '\'' +
                ", book=" + book +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IssueBook issueBook = (IssueBook) o;

        return id == issueBook.id &&
                Objects.equals(email, issueBook.email) &&
                Objects.equals(phone, issueBook.phone) &&
                Objects.equals(fullName, issueBook.fullName) &&
                Objects.equals(book, issueBook.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phone, fullName, book);
    }
}