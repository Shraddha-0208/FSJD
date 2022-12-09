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
ClassesDao dao=new ClassesDao();
Classes c=new Classes();
c.setClass_Id(Integer.parseInt(request.getParameter("Class_id")));
c.setClass_Section(request.getParameter("Class_Section"));
c.setStu_id(Integer.parseInt(request.getParameter("Student_id")));
int row=dao.Classinsert(c);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>