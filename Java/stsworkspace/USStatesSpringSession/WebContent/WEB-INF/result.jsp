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
        <li>${state.abbreviation}</li>
        <li>${state.name}</li>
        <li>${state.capital}</li>
        <li>${state.capitalPopulation}</li>
      </ul>
      
      <form action="navState.do">
	      <input name="prev" type="submit" value="Previous" />
	      <input name="next" type="submit" value="Next" />
      </form>
    </c:when>
    <c:otherwise>
      <p>No state found</p>
    </c:otherwise>
  </c:choose><br>
  <form action="GetStateData.do" method="GET">
    Name:
    <input type="text" name="name"/> 
    <input type="submit" value="Get State Data" />
  </form><br>
  	<form action="GetStateData.do" method="GET">
		Abbreviation:
		<input type="text" name="abbr" size="4"/> 
		<input type="submit" value="Get State Data" />
	</form>
</body>
</html>