package com.ob.userEnd.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentId;
    private String transactionDate;
    private String location;
    private String description;
    private int confirmed;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDate() {
        return transactionDate;
    }

    public void setDate(String date) {
        this.transactionDate = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", date=" + transactionDate +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", confirmed=" + confirmed +
                ", user=" + user +
                '}';
    }
}
