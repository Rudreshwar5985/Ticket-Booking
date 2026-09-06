package com.example.TicketBookin.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="ticket")
public class TicketEnitity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String Email;
    private String Gender;
    private LocalDate Journey_Date;
    private String source;
    private String destination;
    private String 	Actions;
    private String trainNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public LocalDate getJourney_Date() {
        return Journey_Date;
    }

    public void setJourney_Date(LocalDate journey_Date) {
        Journey_Date = journey_Date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getActions() {
        return Actions;
    }

    public void setActions(String actions) {
        Actions = actions;
    }

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }
}
