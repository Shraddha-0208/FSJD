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
SubjectsDao dao=new SubjectsDao();
Subjects Subject=new Subjects();
Subject.setSubject_id(Integer.parseInt(request.getParameter("Subject_id")));
Subject.setSubject_name(request.getParameter("Subject_name"));
int row=dao.Subjectinsert(Subject);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>