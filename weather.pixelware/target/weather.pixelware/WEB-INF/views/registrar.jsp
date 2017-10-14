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

	<form:form id="regForm" modelAttribute="user" action="registerProcess"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="nombreUsuario">Nomrbre de Usuario </form:label></td>
				<td><form:input path="nombreUsuario" name="nombreUsuario"
						id="nombreUsuario" /></td>
			</tr>
			<tr>
				<td><form:label path="pass">Contraseña</form:label></td>
				<td><form:password path="pass" name="pass" id="pass" /></td>
			</tr>
			<tr>
				<td><form:label path="nombre">Nombre</form:label></td>
				<td><form:input path="nombre" name="nombre" id="nombre" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="pais">Pais</form:label></td>
				<td><form:input path="pais" name="pais" id="pais" /></td>
			</tr>
			<tr>
				<td><form:label path="fnacimiento">Fecha de nacimiento</form:label></td>
				<td><form:input path="fnacimiento" name="fnacimiento"
						id="fnacimiento" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button id="registrar" name="registrar">Registrar</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>