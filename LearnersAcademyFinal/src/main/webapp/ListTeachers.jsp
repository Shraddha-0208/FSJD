<%@page import="java.util.*" %>
<%@page import="com.glvc.dao.*" %>
<%@page import="com.glvc.bean.*" %>
<%@page import="com.glvc.dbutil.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>List of Teachers</i></h1>
<table border="1">
<tr><th>Teacher_id</th><th>Fname</th><th>Lname</th><th>Teacher_Age</th><th>Edit Teachers</th><th>Delete Teachers</th></tr>
<%TeachersDao dao=new TeachersDao();
List<Teachers> list=dao.Teacherdisplay();
for(Teachers t:list){
%>
<tr><td><%=t.getTeacher_id()%></td><td><%=t.getFname()%></td><td><%=t.getLname()%></td><td><%=t.getTeacher_age()%></td><td><a href="EditTeachers.jsp?Teacher_id=<%= t.getTeacher_id() %>">Edit</a></td><td><a href="DeleteTeachers.jsp?Teacher_id=<%= t.getTeacher_id() %>">Delete</a></td></tr>
<%} %>
</table>
</body>
</html>