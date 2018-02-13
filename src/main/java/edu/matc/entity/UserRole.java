package edu.matc.entity;

/**
 * The type User role.
 */
public class UserRole {

    private int userRoleId;
    private String roleName;
    private User user;

    /**
     * Instantiates a new User role.
     */
    public UserRole() {
    }

    /**
     * Instantiates a new User role.
     *
     * @param userRoleId the user role id
     * @param roleName   the role name
     * @param user       the user
     */
    public UserRole(int userRoleId, String roleName, User user) {
        this.userRoleId = userRoleId;
        this.roleName = roleName;
        this.user = user;
    }

    /**
     * Gets user role id.
     *
     * @return the user role id
     */
    public int getUserRoleId() {
        return userRoleId;
    }

    /**
     * Sets user role id.
     *
     * @param userRoleId the user role id
     */
    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    @Override
    public String toString() {
        return "UserRole{" +
                "userRoleId=" + userRoleId +
                ", roleName='" + roleName + '\'' +
                ", user=" + user +
                '}';
    }
}
