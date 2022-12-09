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
ClassesDao dao=new ClassesDao();
Classes Class=new Classes();
Class.setClass_Id(Integer.parseInt(request.getParameter("Class_Id")));
Class.setStu_id(Integer.parseInt(request.getParameter("Stu_id")));
int row=dao.Classedit(Class);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>