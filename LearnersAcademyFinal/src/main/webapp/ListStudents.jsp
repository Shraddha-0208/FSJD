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
<h1><i>List of Students</i></h1>
<table border="1">
<tr><th>Student_id</th><th>Student_Fname</th><th>Student_Lname</th><th>Student_Age</th><th>Student_Class</th><th>Edit Action</th><th>Delete Action</th></tr>
<%StudentsDao dao=new StudentsDao();
List<Students> list=dao.Studentdisplay();
for(Students St:list){
%>
<tr><td><%=St.getStudent_id()%></td><td><%=St.getStudent_Fname()%></td><td><%=St.getStudent_Lname()%></td><td><%=St.getStudent_age()%></td><td><%=St.getStudent_class()%></td><td><a href="EditStudents.jsp?Student_id=<%=St.getStudent_id()%>">Edit</a></td><td><a href="DeleteStudents.jsp?Student_id=<%=St.getStudent_id()%>">Delete</a></td></tr>
<%} %>
</table>
</body>
</html>