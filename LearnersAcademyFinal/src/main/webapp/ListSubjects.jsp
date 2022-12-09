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
<h1><i>List of Subjects</i></h1>
<table border="1">
<tr><th>Subject_id</th><th>Subject_name</th><th>Edit Action</th><th>Delete Actions</th></tr>
<%SubjectsDao dao=new SubjectsDao();
List<Subjects> list=dao.Subjectdisplay();
for(Subjects Sub:list){
%>
<tr><td><%=Sub.getSubject_id()%></td><td><%=Sub.getSubject_name()%></td><td><a href="EditSubjects.jsp?Subject_id=<%= Sub.getSubject_id()%>">Edit</a></td><td><a href="DeleteSubjects.jsp?Subject_id=<%= Sub.getSubject_id()%>">Delete</a></td></tr>
<%} %>
</table>
</body>
</html>