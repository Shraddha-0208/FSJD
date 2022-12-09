<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.glvc.dao.*" %>
<%@page import="com.glvc.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
TeachersDao dao=new TeachersDao();
Teachers teacher=new Teachers();
teacher.setTeacher_id(Integer.parseInt(request.getParameter("Teacher_id")));
int row=dao.Teacherdelete(teacher);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>