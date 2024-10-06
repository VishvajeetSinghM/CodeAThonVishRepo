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
public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookPublisher;
    private String bookGenre;
    private double bookPrice;
    private String bookDescription;
    private int bookStockAvail;
    private String bookImage;
    private int eventId;  // event_id has getter, setter, and constructor parameter
    
    // Default constructor
    public Book() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Parameterized constructor (including eventId, but excluding bookId)
    public Book(String bookName, String bookAuthor, String bookPublisher, String bookGenre, 
                double bookPrice, String bookDescription, int bookStockAvail, String bookImage, int eventId) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookGenre = bookGenre;
        this.bookPrice = bookPrice;
        this.bookDescription = bookDescription;
        this.bookStockAvail = bookStockAvail;
        this.bookImage = bookImage;
        this.eventId = eventId;
    }

    // Getter and Setter for bookName
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // Getter and Setter for bookAuthor
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    // Getter and Setter for bookPublisher
    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    // Getter and Setter for bookGenre
    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    // Getter and Setter for bookPrice
    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    // Getter and Setter for bookDescription
    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    // Getter and Setter for bookStockAvail
    public int getBookStockAvail() {
        return bookStockAvail;
    }

    public void setBookStockAvail(int bookStockAvail) {
        this.bookStockAvail = bookStockAvail;
    }

    // Getter and Setter for bookImage
    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    // Getter and Setter for eventId
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
