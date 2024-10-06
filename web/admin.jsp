<%@page import="java.util.HashMap"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.pojo.Event,java.util.Iterator,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="homePage.jsp">Home</a>
        <form action="addEvent.jsp" method="get" style="display: inline;">
            <button type="submit">Add Event</button>
        </form>
        <a href="sales.jsp">Sales</a>
        <h1>Event Names</h1>
        
        <form method="POST" action="EventViewServlet"><button type="Submit" value="show">View Event </button></form>

        <h1>Event Names and Descriptions</h1>
        
        <%
            ArrayList<Event> uList = (ArrayList<Event>) session.getAttribute("eventList");
            HashMap<String, String> map =  (HashMap<String, String>)session.getAttribute("idlist");

            if (uList != null && !uList.isEmpty()) {
                Iterator<Event> it = uList.iterator();
                while (it.hasNext()) {
                    Event e = it.next();
                    String eventName = e.getEventName();
                    String eventId = map.get(eventName); // Get the event ID from the HashMap using the event name as key
        %>
                    <p><strong>Event Name:</strong> <%= eventName %></p>
                    <p><strong>Description:</strong> <%= e.getEventDescription() %></p>
                    <p><strong>Event ID:</strong> <%= eventId %></p>
                    
                    <form action="addBook.jsp" method="get" style="display: inline;">
                        <input type="hidden" name="eid" value="<%= eventId %>" >
                        <button type="submit">Add Book</button>
                    </form>
                            
                    <hr/>
        <%
                }
            } else {
        %>
            <p>No events available at the moment.</p>
        <%
            }
        %>

    </body>
</html>
