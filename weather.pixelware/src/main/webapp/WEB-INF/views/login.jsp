<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- Importamos la librería form de Spring MVC --%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<%-- Importamos la librería core de JSTL --%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<form:form id="loginForm" modelAttribute="login" action="loginProceso"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="nombreUsuario">User name: </form:label></td>
				<td><form:input path="nombreUsuario" name="nombreUsuario" id="nombreUsuario" />
				</td>
			</tr>
			<tr>
				<td><form:label path="pass">Password:</form:label></td>
				<td><form:password path="pass" name="pass"
						id="pass" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">Login</form:button>
				</td>
			</tr>
			<tr></tr>

		</table>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${mensaje}</td>
		</tr>
	</table>

</body>
</html>