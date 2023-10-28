package org.hamerd.logger.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "log_entry")
public class LogEntry {

    protected LogEntry() {}

    public LogEntry(long id, String callsign, String mode, int band, Timestamp createDate, User user) {
        this.id = id;
        this.callsign = callsign;
        this.mode = mode;
        this.band = band;
        this.createDate = createDate;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "callsign")
    private String callsign;

    @Column(name = "mode")
    private String mode;

    @Column(name = "band")
    private int band;

    @Column(name = "create_date")
    private Timestamp createDate;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public long getId() {
        return id;
    }

    public String getCallsign() {
        return callsign;
    }

    public String getMode() {
        return mode;
    }

    public Integer getBand() {
        return band;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public User getUser() {
        return user;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setBand(int band) {
        this.band = band;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "id=" + id +
                ", callsign='" + callsign + '\'' +
                ", mode='" + mode + '\'' +
                ", band=" + band +
                ", createDate=" + createDate +
                ", user=" + user +
                '}';
    }
}
