<%@page import="java.util.List"%>
<%@page import="it.negoziowebproject.model.Negozio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DETTAGLI NEGOZIO</title>
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
	
		
		<% Negozio negozioItem=(Negozio)request.getAttribute("negozioDetailPage");%>
						
				<tr>
				<td><%=negozioItem.getIdNegozio() %></td>
				<td><%=negozioItem.getNome() %></td>
				<td><%=negozioItem.getPartitaIva() %></td>
				<td><%=negozioItem.getNumeroArticoli() %></td>
				<td><%=negozioItem.getIndirizzo() %></td>
				<td><%=negozioItem.getNumeroTelefonico() %></td>
					<td>
						<a href="PreparedUpdateServlet?parametroId=<%=negozioItem.getIdNegozio() %>">Update</a>
					</td>
				</tr>
		<% %>
				
	</table>
	
	
</body>
</html>