package edu.matc.entity;

import java.time.LocalDateTime;

/**
 * The type Issue book.
 */
public class IssueBook {

    private int issueBookId;
    private int callNumber;
    private LocalDateTime issueDate;
    private int userId;
    private String userContact;

    /**
     * Instantiates a new Issue book.
     */
    public IssueBook() {
    }

    /**
     * Instantiates a new Issue book.
     *
     * @param issueBookId the issue book id
     * @param callNumber  the call number
     * @param issueDate   the issue date
     * @param userId      the user id
     * @param userContact the user contact
     */
    public IssueBook(int issueBookId, int callNumber, LocalDateTime issueDate, int userId, String userContact) {
        this.issueBookId = issueBookId;
        this.callNumber = callNumber;
        this.issueDate = issueDate;
        this.userId = userId;
        this.userContact = userContact;
    }

    /**
     * Gets issue book id.
     *
     * @return the issue book id
     */
    public int getIssueBookId() {
        return issueBookId;
    }

    /**
     * Sets issue book id.
     *
     * @param issueBookId the issue book id
     */
    public void setIssueBookId(int issueBookId) {
        this.issueBookId = issueBookId;
    }

    /**
     * Gets call number.
     *
     * @return the call number
     */
    public int getCallNumber() {
        return callNumber;
    }

    /**
     * Sets call number.
     *
     * @param callNumber the call number
     */
    public void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    /**
     * Gets issue date.
     *
     * @return the issue date
     */
    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    /**
     * Sets issue date.
     *
     * @param issueDate the issue date
     */
    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets user contact.
     *
     * @return the user contact
     */
    public String getUserContact() {
        return userContact;
    }

    /**
     * Sets user contact.
     *
     * @param userContact the user contact
     */
    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    @Override
    public String toString() {
        return "IssueBook{" +
                "issueBookId=" + issueBookId +
                ", callNumber=" + callNumber +
                ", issueDate=" + issueDate +
                ", userId=" + userId +
                ", userContact='" + userContact + '\'' +
                '}';
    }
}
