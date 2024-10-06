/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo; 

/**
 *
 * @author Batch1
 */
public class Event {
    private int eventId;
    private String eventName;
    private String eventSdate;
    private String eventEdate;
    private String eventDescription;
    
    // Default constructor
    public Event() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Parameterized constructor
    public Event(int eventId, String eventName, String eventSdate, String eventEdate, String eventDescription) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventSdate = eventSdate;
        this.eventEdate = eventEdate;
        this.eventDescription = eventDescription;
    }

    // Getter and Setter for eventId
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    // Getter and Setter for eventName
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    // Getter and Setter for eventSdate
    public String getEventSdate() {
        return eventSdate;
    }

    public void setEventSdate(String eventSdate) {
        this.eventSdate = eventSdate;
    }

    // Getter and Setter for eventEdate
    public String getEventEdate() {
        return eventEdate;
    }

    public void setEventEdate(String eventEdate) {
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
