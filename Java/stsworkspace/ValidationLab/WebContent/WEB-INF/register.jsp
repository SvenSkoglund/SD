<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- TODO: Add the @taglib for form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Add a form to register.jsp using the @taglib directive's form tags.
(Don't forget to add the @taglib directive to the JSP page.) Use errors
tags to highlight incorrect input. -->

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<!-- TODO: Add registration form -->
	<form:form action="login.do" method="POST" modelAttribute="user">
		<form:label path="email">Email</form:label>
		<form:input path="email" />
		<form:errors path="email" />
		<br>
		<form:label path="password">Password</form:label>
		<form:input path="password" />
		<form:errors path="password" />

		<input type="submit" value="Login" />
	</form:form>
</body>
</html>