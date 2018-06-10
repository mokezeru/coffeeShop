<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/home.css" rel="stylesheet" />
</head>
<body>
	<div id="header">
		<h2>Welcome to Coffee Shop</h2> 	
	</div>
	
	<p>
		<a href="<c:url value="/secure" />"> Login </a>
	<p>
	<div id = "center">
	
	</div>
	
</body>
</html>