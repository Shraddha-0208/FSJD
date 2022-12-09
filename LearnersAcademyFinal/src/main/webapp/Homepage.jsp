<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><center>Welcome to Learner's Academy Admin</center></h1>
<table align ="center" border="1">
<tr><th>Students</th><th>Subjects</th><th>Teachers</th><th>Classes</th></tr>
<tr><td><br><br>
<form action="AddStudents.jsp">
<input type="submit" value="Add Students">
</form><br>
<form action="ListStudents.jsp">
<input type="submit" value="List Students">
</form><br></td>
<td><br><br>
<form action="AddSubjects.jsp">
<input type="submit" value="Add Subjects">
</form><br>
<form action="ListSubjects.jsp">
<input type="submit" value="List Subjects">
</form><br></td>
<td><br><br>
<form action="AddTeachers.jsp">
<input type="submit" value="Add Teachers">
</form><br>
<form action="ListTeachers.jsp">
<input type="submit" value="List Teachers">
</form><br></td>
<td><br><br>
<form action="AddClasses.jsp">
<input type="submit" value="Add Classes">
</form><br>
<form action="ListClasses.jsp">
<input type="submit" value="List Classes">
</form><br>
<form action="AssignTeacherSubject.jsp">
<input type="submit" value="Assign Teacher and Subject">
</form><br>
</td>
</tr>
</table>
</body>
</html>
