package org.hamerd.logger.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "contact_event")
public class ContactEvent {

    protected ContactEvent() {}

//TODO: Make ids automatically generate
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "callsign")
    private String callsign;

    @Column(name = "create_date")
    private Timestamp createDate;

    @Column(name = "mode")
    private String mode;

    @Column(name = "band")
    private int band;

    @OneToOne
    @JoinColumn(name = "contact_event_id", referencedColumnName = "id")
    private ContactEvent contactEvent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getBand() {
        return band;
    }

    public void setBand(int band) {
        this.band = band;
    }

    public ContactEvent getContactEvent() {
        return contactEvent;
    }

    public void setContactEvent(ContactEvent contactEvent) {
        this.contactEvent = contactEvent;
    }

    @Override
    public String toString() {
        return "ContactEvent{" +
                "id=" + id +
                ", callsign='" + callsign + '\'' +
                ", createDate=" + createDate +
                ", mode='" + mode + '\'' +
                ", band=" + band +
                ", contactEvent=" + contactEvent +
                '}';
    }
}

