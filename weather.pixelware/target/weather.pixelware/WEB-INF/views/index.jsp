<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atributos Sesión Spring MVC</title>
</head>
<body>
	<h2>Login Usuario</h2>
	
	<%@ taglib uri="http://www.springframework.org/tags/form"
		prefix="form" %>
	
	
	
	<form:form method="post" modelAttribute="equipo"
		action="login">
	
		<b>Ciudad</b>
		<form:input path="ciudad"/>
		
		<br/><br/>

	
		<input type="submit" value="   Login   " />
	
	</form:form>
	
	<br/><br/>
	<span style="color: red;">${error}</span>
	
</body>
</html>