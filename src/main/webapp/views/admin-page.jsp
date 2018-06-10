<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<link href="css/admin.css" rel="stylesheet" />
</head>
<body>
	<div class="welcome">
		<h2 id="welcome">Admin Welcome ${person.firstName}</h2> 	
	</div>
	<p id="logout">
		<a href="<c:url value="/logout" />"> Logout </a>
	<p>
	<hr />
	<div>
	<fieldset>
      <legend id="legend1">Product</legend>
      	<ul>
			<li><a href="createProduct">Create Product</a></li>
			<li><a href="listProduct">List of Products</a></li>
		</ul>
	</fieldset>
	</div>
	
	<div>
	<fieldset>
      <legend id="legend2">Person</legend>
      	<ul>
			<li><a href="createPerson">Create Person</a></li>
			<li><a href="listPerson">List of Person</a></li>
		</ul>
	</fieldset>
	</div>

	<div>
	<fieldset>
      <legend id="legend3">Order</legend>
      	<ul>
			<li><a href="listOrder">List of Orders</a></li>
		</ul>	
	</fieldset>
	</div>

</body>
</html>