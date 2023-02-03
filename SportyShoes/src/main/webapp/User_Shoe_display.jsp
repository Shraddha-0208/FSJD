<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<%@page import="com.example.demo.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="User_Shoe_display">
<%List<Sporty_Shoes> s1=(List<Sporty_Shoes>)request.getAttribute("User_Shoe_display"); %>
<table border="1">
<tr><th>Shoe_Id</th><th>Shoe_Brand</th><th>Shoe_Price</th><th>Buy Action</th></tr>
<%for(Sporty_Shoes ss:s1){%>
<tr><td><%=ss.getShoe_Id() %></td><td><%=ss.getShoe_Brand() %></td><td><%=ss.getShoe_Price() %></td>
<td><a href="Buy_Shoes.jsp?Shoe_Id=<%=ss.getShoe_Id() %>">Purchase Item</a></td></tr>
<%}%>
</table>
</form>
</body>
</html>