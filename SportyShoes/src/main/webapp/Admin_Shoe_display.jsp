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
<form action="Admin_Shoe_display">
<%List<Sporty_Shoes> s=(List<Sporty_Shoes>)request.getAttribute("list"); %>
<table border="1">
<tr><th>Shoe_Id</th><th>Shoe_Brand</th><th>Shoe_Price</th><th>Edit Action</th><th>Delete Action</th></tr>
<%for(Sporty_Shoes ss:s){%>
<tr><td><%=ss.getShoe_Id() %></td><td><%=ss.getShoe_Brand() %></td><td><%=ss.getShoe_Price() %></td>
<td><a href="Edit_Shoes.jsp?Shoe_Id=<%=ss.getShoe_Id() %>">Edit Shoe Details</a></td>
<td><a href="Delete_Shoes.jsp?Shoe_Id=<%=ss.getShoe_Id() %>">Delete Shoe Details</a></td></tr>
<%}%>
</table>
</form>
</body>
</html>