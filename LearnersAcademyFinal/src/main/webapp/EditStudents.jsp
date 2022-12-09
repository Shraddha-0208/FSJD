<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>Edit Students Details</i></h1>
<form action="EditStudentsController.jsp">
<input type="hidden" name="Student_id" value=<%=request.getParameter("Student_id") %>>
Class to be Edited <input type="text" name="Student_Class"><br><br>
<input type="submit" value="Edit">
</form>
</body>
</html>