/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.pojo.Book;
import com.pojo.Event;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sneha
 */
public class BookDAO {
    public Connection con = null;
    public Statement stmt = null;
    public ResultSet rs=null;
    public PreparedStatement pStmt=null;
    
    public static BookDAO instance=null;
    
    public static synchronized BookDAO getInstance()
    {
        if (instance == null)
            instance = new BookDAO();
        return instance;
    }
    
    public BookDAO() {           
        try{            
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookPedlar","postgres", "rachel");
            System.out.println("Connection Object--------->"+con);
            stmt=con.createStatement();
        }
        catch(Exception e){            
            e.printStackTrace();            
        }
    }
    
    public ArrayList executeLogin(String username, String pwd){
        ArrayList userDetails = new ArrayList();
        try{
            System.out.println("SEARCH: "+username+pwd);  
            rs= stmt.executeQuery("SELECT * FROM UserData WHERE user_name = '"+username+"' AND user_password ='"+pwd+"'");
            if(!rs.next()){               
                //user not found
            }
            else{
                userDetails.add(rs.getString(2));
                userDetails.add(rs.getString(3));
            }                      
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return userDetails;
    }
    
    
   public boolean executeBookInsert(Book book) {
    try {
        pStmt = con.prepareStatement("INSERT INTO Book (book_name, book_author, book_publisher, book_genre, book_price, book_description, book_stock_avail, book_image, event_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        // Set the values based on the getters of the Book class
        pStmt.setString(1, book.getBookName());        // book_name
        pStmt.setString(2, book.getBookAuthor());      // book_author
        pStmt.setString(3, book.getBookPublisher());   // book_publisher
        pStmt.setString(4, book.getBookGenre());       // book_genre
        pStmt.setDouble(5, book.getBookPrice());       // book_price
        pStmt.setString(6, book.getBookDescription());  // book_description
        pStmt.setInt(7, book.getBookStockAvail());      // book_stock_avail
        pStmt.setString(8, book.getBookImage());        // book_image
        pStmt.setInt(9, book.getEventId());             // event_id

        int rowCount = pStmt.executeUpdate();
        return rowCount > 0; // Return true if insert was successful
    } catch (SQLException e) {
        e.printStackTrace(); // Optionally log or print the exception
    }
    return false; // Return false if an exception occurs or no rows were affected
}

    public ArrayList<Event> executeEventSearch() {
    ArrayList<Event> eventList = new ArrayList<>();

    try {
        
        rs = stmt.executeQuery("SELECT * FROM Event WHERE event_sdate >= CURRENT_DATE");

        while (rs.next()) {
            // Create an Event object using the result set
            Event event = new Event(
                    rs.getString("event_name"),     // Assuming event_name is a string
                    rs.getDate("event_sdate"),      // Assuming event_sdate is a date
                    rs.getDate("event_edate"),      // Assuming event_edate is a date
                    rs.getString("event_description") // Assuming event_description is a string
            );
            eventList.add(event); // Add the Event object to the list
            String name=rs.getString("event_name");
            String id=rs.getString("event_id");
              
        }
        
        
    } catch (SQLException e) {
        e.printStackTrace(); // Handle SQL exception
    }
    return eventList; // Return the list of events
}
    
      public HashMap<String,String> executeEventID() {
//    ArrayList<Event> eventList = new ArrayList<>();
    HashMap<String,String> eventNameIdPair = new HashMap<>();

    try {
        rs = stmt.executeQuery("SELECT * FROM Event WHERE event_sdate >= CURRENT_DATE");

        while (rs.next()) {
            // Create an Event object using the result set
                    String name= rs.getString("event_name");
                    String id= rs.getString("event_id");
                    eventNameIdPair.put(name,id);
                }   
        }
        catch (SQLException e) {
        e.printStackTrace(); // Handle SQL exception
    }
    return eventNameIdPair; // Return the list of events
}
   

    
   
    public boolean executeEventInsert(Event e){
        try{
            pStmt = con.prepareStatement("INSERT INTO Event(event_name, event_sdate, event_edate,event_description) VALUES(?,?,?,?)");
            pStmt.setString(1,e.getEventName());
            pStmt.setDate(2,e.getEventSdate());
            pStmt.setDate(3,e.getEventEdate());
            pStmt.setString(4,e.getEventDescription());
            
            int rowCount= pStmt.executeUpdate();
            if(rowCount >0){
                return true;
            }            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
}