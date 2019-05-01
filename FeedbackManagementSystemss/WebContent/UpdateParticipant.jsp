<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Participant</title>
</head>
<body>

<div class="navbar-nav">
      <a class="nav-item nav-link active" href="./TrainerHomePage.jsp">Home</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
      <a class="nav-item nav-link" href="./AddParticipant.jsp">Add Participant</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
      <a class="nav-item nav-link" href="./DeleteParticipant.jsp">Delete Participant</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
       <a class="nav-item nav-link" href="./UpdateParticipant.jsp">Update Participant</a>
     
    </div>
    <br>
    <br>

<form action="./update" method="post">
 

		<p>Participant Id</p>
		<input type="text" name="employee_id" placeholder="Enter id">
		<p>Employee_Name</p>
		<input type="text" name="employee_name" placeholder="Enter name">
		<p>Password</p>
		<input type="text" name="password" placeholder="Enter Password">
		<p>Role</p>
		<input type="text" name="role" placeholder="Enter Role">
		
		
		<input type="submit" name="submit" value="Update Participant">
	</form>

</body>
</html>