<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>Adding the Student</i></h1>
<form action="AddStudentController.jsp">
<table>
<tr><td>Student_id</td><td><input type="text" name="Student_id"></td></tr>
<tr><td>Student_Fname</td><td><input type="text" name="Student_Fname"></td></tr>
<tr><td>Student_Lname</td><td><input type="text" name="Student_Lname"></td></tr>
<tr><td>Student_age</td><td><input type="text" name="Student_age"></td></tr>
<tr><td>Student_class</td><td><input type="text" name="Student_class"></td></tr>
<tr><td><input type="submit" value="Add Student"></td></tr>
</table>
</form>
</body>
</html>