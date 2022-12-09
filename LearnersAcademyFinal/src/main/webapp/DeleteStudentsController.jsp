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
StudentsDao dao=new StudentsDao();
Students Student=new Students();
Student.setStudent_id(Integer.parseInt(request.getParameter("Student_id")));
int row=dao.Studentdelete(Student);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>