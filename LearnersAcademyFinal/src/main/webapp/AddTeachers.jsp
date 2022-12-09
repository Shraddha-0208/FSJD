<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>Adding the Teacher</i></h1>
<form action="AddTeacherController.jsp">
<table>
<tr><td>Teacher_id</td><td><input type="text" name="Teacher_id"></td></tr>
<tr><td>Fname</td><td><input type="text" name="Teacher_Fname"></td></tr>
<tr><td>Lname</td><td><input type="text" name="Teacher_Lname"></td></tr>
<tr><td>Teacher_age</td><td><input type="text" name="Teacher_age"></td></tr>
<tr><td><input type="submit" value="Add Teacher"></td></tr>
</table>
</form>
</body>
</html>