<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav>
	<a href="index.do">Home</a> <a href="login.do">Log In</a>
	<c:if test="${loggedIn == true}">
	<a href="account.do">Account</a>
		<a href="logout.do">Log Out</a>
	</c:if>

</nav>
</body>
</html>