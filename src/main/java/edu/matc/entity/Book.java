package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "Book")
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String title;

    private String author;

    private String isbn;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<IssueBook> issueBooks = new HashSet<>();


    public Book() {
    }

    public Book(String title, String author, String isbn, User user) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.user = user;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<IssueBook> getIssueBooks() {
        return issueBooks;
    }

    public void setIssueBooks(Set<IssueBook> issueBooks) {
        this.issueBooks = issueBooks;
    }

    public void addIssueBook(IssueBook issueBook) {
        issueBooks.add(issueBook);
        issueBook.setBook(this);
    }

    public void removeIssueBook(IssueBook issueBook) {
        issueBooks.remove(issueBook);
        issueBook.setBook(null);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn) &&
                Objects.equals(user, book.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, author, isbn, user);
    }
}
