<%-- 
    Document   : addEvent
    Created on : 06-Oct-2024, 1:33:58 pm
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="">
            Enter event Name:
            <input type="text" name="eventName" id="eventName"><br>
            Enter Start Date:
            <input type="date" name="startDate" id="startDate"><br>
            Enter End Date:
            <input type="date" name="endDate" id="endDate"> 
            Enter description
            <input type="text" name="description" id="description">
            <button type="Submit" value="Submit">Add</button>
        </form> 
        <h1>Hello World!</h1>
    </body>
</html>
