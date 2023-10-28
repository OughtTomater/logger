package org.hamerd.logger.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "contact_event")
public class ContactEvent {

    protected ContactEvent() {}

    public ContactEvent(long id, String name, String address, String stateProvince, String country, ContactEvent contactEvent) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.stateProvince = stateProvince;
        this.country = country;
        this.contactEvent = contactEvent;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "state_province")
    private String stateProvince;

    @Column(name = "country")
    private String country;

    @OneToOne
    @JoinColumn(name = "contact_event_id", referencedColumnName = "id")
    private ContactEvent contactEvent;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public ContactEvent getContactEvent() {
        return contactEvent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setContactEvent(ContactEvent contactEvent) {
        this.contactEvent = contactEvent;
    }

    @Override
    public String toString() {
        return "ContactEvent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", stateProvince=" + stateProvince +
                ", country=" + country +
                ", contactEvent=" + contactEvent +
                '}';
    }
}

