<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>Assigning Teacher and Subject to the Class</i></h1>
<form action="AssignController.jsp">
<table>
<tr><td>Class_id</td><td><input type="text" name="Class_id"></td></tr>
<tr><td>Teacher_id</td><td><input type="text" name="Teacher_id"></td></tr>
<tr><td>Subject_id</td><td><input type="text" name="Subject_id"></td></tr>
<tr><td><input type="submit" value="Assign"></td></tr>
</table>
</form>
</body>
</html>