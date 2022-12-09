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
<h1><i>List of Classes</i></h1>
<table border="1">
<tr><th>Class_Id</th><th>Class_Section</th><th>Student_id</th><th>List Student</th><th>Edit Action</th><th>Delete Action</th><th>Show Report</th></tr>
<%ClassesDao dao=new ClassesDao();
List<Classes> list=dao.Classdisplay();
for(Classes c:list){
%>
<tr><td><%=c.getClass_Id()%></td><td><%=c.getClass_Section()%></td><td><%=c.getStu_id()%></td><td><a href="ListStudentsForClasses.jsp">Show List</a></td><td><a href="EditClasses.jsp?Class_Id=<%= c.getClass_Id()%>">Edit</a></td><td><a href="DeleteClasses.jsp?Class_Id=<%= c.getClass_Id()%>">Delete</a><br></td><td><a href="ReportGeneration.jsp">Generate Report</a></td></tr>
<%} %>
</table>
</body>
</html>