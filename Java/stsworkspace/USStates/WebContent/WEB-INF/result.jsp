<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>States</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty state}">
			<ul>
				<li><strong>Abbreviation: </strong>${state.abbreviation}</li>
				<li><strong>Name: </strong>${state.name}</li>
				<li><strong>Capital: </strong>${state.capital}</li>
				<li><strong>Latitude: </strong>${state.latitude}</li>
				<li><strong>Longitude: </strong>${state.longitude}</li>
			</ul>
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d98212.53627550739!2d${state.longitude }!3d${state.latitude }!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sus!4v1523465032580"
				width="600" height="450" frameborder="20"
				style="border: 2px solid blue" allowfullscreen></iframe>


		</c:when>
		<c:otherwise>
			<p>No state found</p>
		</c:otherwise>
	</c:choose>
</body>
</html>