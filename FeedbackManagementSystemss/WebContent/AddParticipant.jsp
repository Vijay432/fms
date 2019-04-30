<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Participant</title>
</head>
<body>
<h1 align=center>Add Participant</h1>

	<form action="./add" method="post">
		<p>Participant Id</p>
		<input type="text" name="employee_id" placeholder="Enter id">
		<p>Username</p>
		<input type="text" name="employee_name" placeholder="Enter Username">
		<p>Password</p>
		<input type="password" name="password" placeholder="Enter Password">
		<p>role</p>
		<input type="text" name="role" placeholder="role"> <input
			type="submit" name="submit" value="Add Participant">

	</form>
</body>
</html>