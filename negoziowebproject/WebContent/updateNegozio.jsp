<%@page import="it.negoziowebproject.model.Negozio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE NEGOZIO</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
	<table class="table table-striped">


 <% 
	Negozio negozioItem = (Negozio)request.getAttribute("negozioDaAggiornare");

 %>
 




<tr>
<form action="UpdateServlet?parametroId=<%=negozioItem.getIdNegozio() %>" method="Post">
		<label for="nomeUpdateId">NOME:</label><br>
		<input type="text" name="nomeUpdate" id="nomeUpdateId" value="<%=negozioItem.getNome()%>">
		<br>
		<label for="partitaIvaUpdateId">PARTITA IVA:</label><br>
		<input type="text" name="partitaIvaUpdate" id="partitaIvaUpdateId" value="<%=negozioItem.getPartitaIva()%>">
		<br>
		<label for="numeroArticoliUpdateId">NUMERO ARTICOLI:</label><br>
		<input type="text" name="numeroArticoliUpdate" id="numeroArticoliUpdateId" value="<%=negozioItem.getNumeroArticoli()%>">
		<br>
		<label for="indirizzoUpdateId">INDIRIZZO:</label><br>
		<input type="text" name="indirizzoUpdate" id="indirizzoUpdateId" value="<%=negozioItem.getIndirizzo()%>">
		<br>
		<label for="numeroTelefonicoUpdateId">NUMERO TELEFONICO:</label><br>
		<input type="text" name="numeroTelefonicoUpdate" id="numeroTelefonicoUpdateId" value="<%=negozioItem.getNumeroTelefonico()%>">
			<br><br>
	<input type="submit" value="UPDATE">
	</form>


</table>
</div>
</body>
</html>