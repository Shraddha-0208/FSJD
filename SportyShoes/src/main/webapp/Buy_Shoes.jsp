<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<center>
<meta charset="ISO-8859-1">
<h1>Welcome to Sporty Shoes Website</h1>
<h2>Buy Shoes </h2>
</head>
<body>
<form action="PayReceipt.jsp">
<input type="hidden" name="Shoe_Id"value=<%=request.getParameter("Shoe_Id") %>><br> 
Payment<input type="text" name="Pay"><br> <br>
<input type="submit" value="pay">
</form>
</body>
</center>
</html>