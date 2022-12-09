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
Students student=new Students();
student.setStudent_id(Integer.parseInt(request.getParameter("Student_id")));
student.setStudent_class(Integer.parseInt(request.getParameter("Student_class")));
int row=dao.Studentedit(student);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>