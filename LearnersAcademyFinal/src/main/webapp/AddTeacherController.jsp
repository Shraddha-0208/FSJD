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
<%
TeachersDao dao=new TeachersDao();
Teachers Teacher=new Teachers();
Teacher.setTeacher_id(Integer.parseInt(request.getParameter("Teacher_id")));
Teacher.setFname(request.getParameter("Fname"));
Teacher.setLname(request.getParameter("Lname"));
Teacher.setTeacher_age(Integer.parseInt(request.getParameter("Teacher_age")));
int row=dao.Teacherinsert(Teacher);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>