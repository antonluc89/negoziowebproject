<%@page import="java.util.List"%>
<%@page import="it.negoziowebproject.model.Negozio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CANCELLAZIONE</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
</style>

</head>
<body>

	<table class="center">

		<%
			Negozio negozioItem = (Negozio) request.getAttribute("negozioDaEliminare");
		%>

		<h1>
			Sei proprio sicuto di voler eliminare il negozio con id:<%=negozioItem.getIdNegozio()%></h1>

		<form action="DeleteServlet?parametroId=<%=negozioItem.getIdNegozio() %>" method="post">

<input type="submit" value="Delete">
</form>

</body>
</html>