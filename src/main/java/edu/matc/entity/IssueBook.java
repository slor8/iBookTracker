package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * The type Issue book.
 */
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
    private String isbn;

    @ManyToOne
    private Book book;

    /**
     * Instantiates a new Issue book.
     */
    public IssueBook() {
    }

    /**
     * Instantiates a new Issue book.
     *
     * @param email    the email
     * @param phone    the phone
     * @param fullName the full name
     * @param book     the book
     */
    public IssueBook(String email, String phone, String fullName, String isbn, Book book) {
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
        this.isbn = isbn;
        this.book = book;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name.
     *
     * @param fullName the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets book.
     *
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * Sets book.
     *
     * @param book the book
     */
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
                ", isbn='" + isbn + '\'' +
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
                Objects.equals(isbn, issueBook.isbn) &&
                Objects.equals(book, issueBook.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phone, fullName, isbn, book);
    }
}