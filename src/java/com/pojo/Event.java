/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pojo;

/**
 *
 * @author sneha
 */
public class Event {
    private String eventName;
    private java.sql.Date eventSdate;
    private java.sql.Date eventEdate;
    private String eventDescription;
    
    // Default constructor
    public Event() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Parameterized constructor
    public Event(String eventName, java.sql.Date eventSdate, java.sql.Date eventEdate, String eventDescription) {
        this.eventName = eventName;
        this.eventSdate = eventSdate;
        this.eventEdate = eventEdate;
        this.eventDescription = eventDescription;
    }
    
    // Getter and Setter for eventName
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    // Getter and Setter for eventSdate
    public java.sql.Date getEventSdate() {
        return eventSdate;
    }

    public void setEventSdate(java.sql.Date eventSdate) {
        this.eventSdate = eventSdate;
    }

    // Getter and Setter for eventEdate
    public java.sql.Date getEventEdate() {
        return eventEdate;
    }

    public void setEventEdate(java.sql.Date eventEdate) {
        this.eventEdate = eventEdate;
    }

    // Getter and Setter for eventDescription
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
}