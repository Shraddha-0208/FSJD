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
<form action="UserList">
<%List<User> s=(List<User>)request.getAttribute("UserList"); %>
<table border="1">
<tr><th>Shoe_Id</th><th>Shoe_Brand</th><th>Shoe_Price</th></tr>
<%for(User ss:s){%>
<tr><td><%=ss.getUser_Id() %></td><td><%=ss.getUser_Name() %></td><td><%=ss.getUser_Email_Id() %></td><td><%=ss.getUser_Password() %></td></tr>
<%}%>
</table>
</form>
</body>
</html>