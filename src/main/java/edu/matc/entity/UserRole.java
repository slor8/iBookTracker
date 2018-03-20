package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "UserRole")
@Table(name = "userRole")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "role_user_user_id_fk")
    )
    private User user;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "userRole_name")
    private String userRoleName;

    public UserRole() {
    }

    public UserRole(User user, String userName, String userRoleName) {
        this.user = user;
        this.userName = userName;
        this.userRoleName = userRoleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", user=" + user +
                ", userName='" + userName + '\'' +
                ", userRoleName='" + userRoleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        return id == userRole.id &&
                Objects.equals(userName, userRole.userName) &&
                Objects.equals(userRoleName, userRole.userRoleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userRoleName, userName);
    }
}
