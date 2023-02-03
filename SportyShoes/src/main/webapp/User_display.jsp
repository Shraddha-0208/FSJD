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
<form action="User_display">
<%List<User> u=(List<User>)request.getAttribute("list"); %>
<table border="1">
<tr><th>User_Id</th><th>User_Name</th><th>User_Email_Id</th><th>User_Password</th></tr>
<%for(User uu:u){%>
<tr><td><%=uu.getUser_Id()%></td><td><%=uu.getUser_Name() %></td><td><%=uu.getUser_Email_Id() %></td><td><%=uu.getUser_Password() %></td></tr>
<%}%>
</table>
</form>
</body>
</html>