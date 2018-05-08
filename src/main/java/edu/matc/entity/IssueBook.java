package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
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
    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "returnBook_user_fk")
    )
    private User user;

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
     * @param title    the isbn
     * @param user     the user
     */
    public IssueBook(String email, String phone, String fullName, String title, User user) {
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
        this.title = title;
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


    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets full name.
     *

     * @param fullName the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "IssueBook{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", fullName='" + fullName + '\'' +
                ", title='" + title + '\'' +
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
                Objects.equals(title, issueBook.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phone, fullName, title);
    }
}