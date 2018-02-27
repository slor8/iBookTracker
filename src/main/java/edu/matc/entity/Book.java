package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type Book.
 */
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


    /**
     * Instantiates a new Book.
     */
    public Book() {
    }

    /**
     * Instantiates a new Book.
     *
     * @param title  the title
     * @param author the author
     * @param isbn   the isbn
     * @param user   the user
     */
    public Book(String title, String author, String isbn, User user) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.user = user;
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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets isbn.
     *
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets isbn.
     *
     * @param isbn the isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets issue books.
     *
     * @return the issue books
     */
    public Set<IssueBook> getIssueBooks() {
        return issueBooks;
    }

    /**
     * Sets issue books.
     *
     * @param issueBooks the issue books
     */
    public void setIssueBooks(Set<IssueBook> issueBooks) {
        this.issueBooks = issueBooks;
    }

    /**
     * Add issue book.
     *
     * @param issueBook the issue book
     */
    public void addIssueBook(IssueBook issueBook) {
        issueBooks.add(issueBook);
        issueBook.setBook(this);
    }

    /**
     * Remove issue book.
     *
     * @param issueBook the issue book
     */
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
