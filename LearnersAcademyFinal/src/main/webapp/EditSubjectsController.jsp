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
SubjectsDao dao=new SubjectsDao();
Subjects Subject=new Subjects();
Subject.setSubject_id(Integer.parseInt(request.getParameter("Subject_id")));
Subject.setSubject_name(request.getParameter("Subject_name"));
int row=dao.Subjectedit(Subject);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>