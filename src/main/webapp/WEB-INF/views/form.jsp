<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Basic Form</title>
</head>
<body>
    <h2>Basic Form</h2>
    <form action="submitForm" method="post">
        <label for="name">Enter Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>

        <label for="mobileNumber">Enter Mobile Number:</label>
        <input type="text" id="mobileNumber" name="mobileNumber" required>
        <br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
