<%@page import="it.negoziowebproject.model.Negozio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE NEGOZIO</title>
</head>
<body>

 <% 
	Negozio negozioItem = (Negozio)request.getAttribute("negozioDaAggiornare");

 %>
 
<table width="80" id="customers" id="Add">



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
</body>
</html>