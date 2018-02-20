package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
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

    private String isbn;

    private String user_Name;

    private String user_Phone;

    //private LocalDateTime issue_date;

    @ManyToOne
    private User user;


    /**
     * Instantiates a new Issue book.
     */
    public IssueBook() {
    }

    /**
     * Instantiates a new Issue book.
     *
     * @param isbn       the isbn
     * @param user_Name  the user name
     * @param user_Phone the user phone
     * //@param issue_date the issue date
     * @param user       the user
     */
    public IssueBook(String isbn, String user_Name, String user_Phone, /**LocalDateTime issue_date,**/ User user) {
        this.isbn = isbn;
        this.user_Name = user_Name;
        this.user_Phone = user_Phone;
        //this.issue_date = issue_date;
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
     * Gets user name.
     *
     * @return the user name
     */
    public String getUser_Name() {
        return user_Name;
    }

    /**
     * Sets user name.
     *
     * @param user_Name the user name
     */
    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    /**
     * Gets user phone.
     *
     * @return the user phone
     */
    public String getUser_Phone() {
        return user_Phone;
    }

    /**
     * Sets user phone.
     *
     * @param user_Phone the user phone
     */
    public void setUser_Phone(String user_Phone) {
        this.user_Phone = user_Phone;
    }

    /**
     * Gets issue date.
     *
     * @return the issue date
     */
    //public LocalDateTime getIssue_date() {
    //    return issue_date;
    //}

    /**
     * Sets issue date.
     *
     * @param issue_date the issue date
     */
    //public void setIssue_date(LocalDateTime issue_date) {
    //    this.issue_date = issue_date;
    //}

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

    @Override
    public String toString() {
        return "IssueBook{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", user_Name='" + user_Name + '\'' +
                ", user_Phone='" + user_Phone + '\'' +
                //", issue_date=" + issue_date +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IssueBook issueBook = (IssueBook) o;
        return id == issueBook.id &&
                Objects.equals(isbn, issueBook.isbn) &&
                Objects.equals(user_Name, issueBook.user_Name) &&
                Objects.equals(user_Phone, issueBook.user_Phone) &&
                Objects.equals(user, issueBook.user);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, isbn, user_Name, user_Phone, user);
    }
}