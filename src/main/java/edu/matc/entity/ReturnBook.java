package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * The type Issue book.
 */
@Entity(name = "ReturnBook")
@Table(name = "returnBook")
public class ReturnBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String email;
    private String phone;

    private String fullName;
    private String isbn;

    @ManyToOne
            @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "issue"))
    private User user;

    /**
     * Instantiates a new Issue book.
     */
    public ReturnBook() {
    }

    /**
     * Instantiates a new Issue book.
     *
     * @param email    the email
     * @param phone    the phone
     * @param fullName the full name
     * @param isbn     the isbn
     * @param user     the user
     */
    public ReturnBook(String email, String phone, String fullName, String isbn, User user) {
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ReturnBook{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", fullName='" + fullName + '\'' +
                ", isbn='" + isbn + '\'' +
                //", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnBook returnBook = (ReturnBook) o;

        return id == returnBook.id &&
                Objects.equals(email, returnBook.email) &&
                Objects.equals(phone, returnBook.phone) &&
                Objects.equals(fullName, returnBook.fullName) &&
                Objects.equals(isbn, returnBook.isbn); //&&
                //Objects.equals(user, returnBook.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phone, fullName, isbn); //, user);
    }
}