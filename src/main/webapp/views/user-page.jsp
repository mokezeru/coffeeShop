<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<link href="css/user.css" rel="stylesheet" />
</head>
<body>
<div class="welcome">
		<h2 id="welcome">User Welcome ${person.firstName}</h2> 	
	</div>
	<p id="logout">
		<a href="<c:url value="/logout" />"> Logout </a>
	<p>
<hr/>
<div>
	<fieldset>
      <legend id="legend1">User Activity</legend>
      	<ul>
			<li><a href="updateprofile">Update Profile</a> </li>
			<li><a href="placeOrder">Place Order</a> </li>
		</ul>
	</fieldset>
</div>
<hr/>

</body>
</html>