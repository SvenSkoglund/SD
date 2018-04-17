<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--Edit the file nav.jsp to change nav links --%>
	<%@ include file="nav.jsp"%>
	<h2>Your Details</h2>

	<%-- Output user details --%>
	<ul>
			<li>${user.userName }</li>
			<li>${user.firstName }</li>
			<li>${user.lastName }</li>
		</ul>
	<!-- private int userId;
  private String userName;
  private String password;
  private String firstName;
  private String lastName; -->
	<c:out value="">
		<ul>
			<li>"${user.userName }"</li>
			<li>"${user.firstName }"</li>
			<li>"${user.lastName }"</li>
		</ul>
	</c:out>
</body>
</html>