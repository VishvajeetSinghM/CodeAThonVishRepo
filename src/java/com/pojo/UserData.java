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
public class UserData {
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userImage;
    private String address;  // Added address field
    
    // Default constructor
    public UserData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Parameterized constructor (excluding userId)
    public UserData(String userName, String userPassword, String userEmail, String userImage, String address) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userImage = userImage;
        this.address = address;
    }

    // Getter and Setter for userName
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Getter and Setter for userPassword
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    // Getter and Setter for userEmail
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    // Getter and Setter for userImage
    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
