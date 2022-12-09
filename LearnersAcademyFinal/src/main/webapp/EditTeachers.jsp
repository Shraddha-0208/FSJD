<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>Edit Teachers Details</i></h1>
<form action="EditTeachersController.jsp">
<input type="hidden" name="Teacher_id" value=<%=request.getParameter("Teacher_id") %>>
Fname to be Edited<input type="text" name="Fname"><br><br>
Lname to be Edited<input type="text" name="Lname"><br><br>
Age to be Edited<input type="text" name="Teacher_Age"><br><br>
<input type="submit" value="Edit">
</form>
</body>
</html>