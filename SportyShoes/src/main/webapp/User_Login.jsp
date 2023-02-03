<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<center>
<h1>Welcome to Sporty Shoes Website</h1>
</head>
<body>
<div>
<br><br>
<h2>Login Into your Account</h2>
<table border="5">
<tr><th>
<div class="box">
<form action="User_Login">
<br><b>User Name :</b>&nbsp;<input type="text" name="Username" placeholder="User Name"></th></tr><br><br>
<tr><th><br><b>Password :</b>&nbsp;<input type="password" name="Password" placeholder="Password"></tr></th><br><br>
<tr><th><br><a href="User_Forgot_Pwd.jsp">Forgot Password</a><br><br><br>
<input type="submit" value="Log In"></th></tr>
</form>
</div>
</center>
</body>
</html>