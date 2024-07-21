<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Pagina Due</title>
</head>
<body>
<%
		
		List<String> lista = new ArrayList<>();
		lista.add("elemento 1");
		lista.add("elemento 2");
		lista.add("elemento 3");
		request.setAttribute("lista", lista);
		request.setAttribute("credito", 130.537893);
	%>
	
	<ul>
		<c:forEach items="${lista}" var="elemento">
		<li>${elemento}</li>
		</c:forEach>
	</ul>
	
	<c:if test = "${credito > 100}">
		<h1>Congratulazioni hai un credito di
			<fmt:formatNumber value="${credito}" maxFractionDigits="2" type="currency" currencyCode="EUR" currencySymbol="€"></fmt:formatNumber>
			<a href="uno?nome=${nomeUtente}">Torna a pagina uno</a>
		 </h1>
	</c:if>
</body>
</html>