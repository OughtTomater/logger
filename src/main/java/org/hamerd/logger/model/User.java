package org.hamerd.logger.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User {

    protected User() {}

    public User(long id, String callSign, String userName) {
        this.id = id;
        this.callSign = callSign;
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "callsign")
    private String callSign;

    @Column(name = "username")
    private String userName;

    public long getId() {
        return id;
    }

    public String getCallSign() {
        return callSign;
    }

    public String getUserName() {
        return userName;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", callSign='" + callSign + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
