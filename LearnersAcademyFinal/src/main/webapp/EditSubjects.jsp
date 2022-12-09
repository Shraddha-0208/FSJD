<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><i>Edit Subjects Details</i></h1>
<form action="EditSubjectsController.jsp">
<input type="hidden" name="Subject_id" value=<%=request.getParameter("Subject_id") %>>
Subject name to be Edited<input type="text" name="Subject_name"><br><br>
<input type="submit" value="Edit">

</form>
</body>
</html>