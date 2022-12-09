<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>Edit Classes Details</i></h1>
<form action="EditClassController.jsp">
<input type="hidden" name="Class_id" value=<%=request.getParameter("Class_id") %>>
Student Id to be Edited<input type="text" name="Student_Id"><br><br>
<input type="submit" value="Edit">

</form>
</body>
</html>