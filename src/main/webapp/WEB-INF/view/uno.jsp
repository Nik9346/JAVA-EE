<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina Uno</title>
</head>
<body>
	<%
		String saluto = "Benvenuto ";
		List<String> lista = new ArrayList<>();
		lista.add("elemento 1");
		lista.add("elemento 2");
		lista.add("elemento 3");
	%>
	
	<h1><%=saluto%> ${nomeUtente}</h1>
	<h2>Ciao <%=request.getParameter("nome")%></h2>
	<ul>
		<%for(String elemento : lista) { %>
		<li><%=elemento%></li>
		<%} %>
	</ul>
</body>
</html>