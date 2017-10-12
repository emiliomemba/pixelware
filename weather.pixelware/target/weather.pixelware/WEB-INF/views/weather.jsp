<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Weather</h2>

	<%-- Importamos la librería core de JSTL --%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<%-- Importamos la librería form de Spring MVC --%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<%-- Crear formulario enlazado al objeto del modelo
		 formPublicacion mediante el atributo commandName
		 de la etiqueta form --%>
	<form:form method="post" commandName="formWeather">
	
		<form:label path="texto">Ciudad</form:label>
		<%-- Enlazamos caja de texto a la propiedad texto --%>
		<form:input path="name"/>
		
		<br/><br/>
		
		<input type="submit" value=" Consultar ">
	
	</form:form>



</body>
</html>