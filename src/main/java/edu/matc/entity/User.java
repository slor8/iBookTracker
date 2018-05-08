package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity (name = "User")
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    // one user can have multiple books
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Book> books = new HashSet<>();

    // one user can have multiple roles
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    // one user can return multiple books
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<IssueBook> issueBooks = new HashSet<>();

    /**
     * Instantiates a new User.
     */
    public User() {

    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userName  the user name
     * @param password  the password
     */
    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
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
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets books.
     *
     * @return the books
     */
    public Set<Book> getBooks() {
        return books;
    }

    /**
     * Sets books.
     *
     * @param books the books
     */
    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     * Add book.
     *
     * @param book the book
     */
    public void addBook(Book book) {
        books.add(book);
        book.setUser(this);
    }

    /**
     * Remove book.
     *
     * @param book the book
     */
    public void removeBook(Book book) {
        books.remove(book);
        book.setUser(null);
    }

    public void addRole(Role role) {
        roles.add(role);
        role.setUser(this);
    }

    public void removeRole(Role role) {
        roles.remove(role);
        role.setUser(null);
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
    public void addReturnBook(IssueBook issueBook) {
        issueBooks.add(issueBook);
        issueBook.setUser(this);
    }

    /**
     * Remove issue book.
     *
     * @param issueBook the issue book
     */
    public void removeReturnBook(IssueBook issueBook) {
        issueBooks.remove(issueBook);
        issueBook.setUser(null);
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return id == user.id &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, userName, password);
    }
}
