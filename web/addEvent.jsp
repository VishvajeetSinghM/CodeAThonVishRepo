<%-- 
    Document   : event
    Created on : 6 Oct 2024, 2:56:37 pm
    Author     : sneha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Event</title>
    </head>
    <body>
        <h1>Add Event</h1>
        <form action="AddEventServlet" method="post">           
           <table border="1" style="border: 1px solid #ddd; border-radius: 5px;">
            <tr>
                <td><label for="event-name">Event Name:</label></td>
                <td><input type="text" id="event-name" name="event_name" required></td>
            </tr>
            <tr>
                <td><label for="event-start-date">Event Start Date:</label></td>
                <td><input type="date" id="event-start-date" name="event_start_date" required></td>
            </tr>
            <tr>
                <td><label for="event-end-date">Event End Date:</label></td>
                <td><input type="date" id="event-end-date" name="event_end_date" required></td>
            </tr>
            <tr>
                <td><label for="event-description">Event Description:</label></td>
                <td><textarea id="event-description" name="event_description" rows="4" required></textarea></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center;">
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>
        </form>
        <%String resultData = (String)session.getAttribute("result");
            String valColor= (String)session.getAttribute("fontcolor");
            System.out.println ("COLOR"+valColor);
            if(resultData!=null){
            
            %>
            <p style="font-family:verdana;color:<%=valColor%>">
            <%out.println("STATUS:-->"+resultData);
                }
        %>
    </body>
</html>