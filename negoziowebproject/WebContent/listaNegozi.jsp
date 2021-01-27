<%@page import="java.util.List"%>
<%@page import="it.negoziowebproject.model.Negozio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LISTA NEGOZI</title>
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
		<thead>
			<tr>
				<th>Nome</th>
				<th>Numero Articoli</th>
				<th>Azione</th>
			</tr>
		</thead>
		
		<% List<Negozio> servletList = (List<Negozio>)request.getAttribute("listAttributeNegozio");
							for(Negozio negozioItem : servletList){
				%>
				<tr>
					<td><%=negozioItem.getNome() %></td>
					<td><%=negozioItem.getNumeroArticoli() %></td>
					<td>
						<a href="ViewDetailServlet?parametroId=<%=negozioItem.getIdNegozio() %>">Show detail</a>
						<a href="PreparedUpdateServlet?parametroId=<%=negozioItem.getIdNegozio() %>">Update</a>
						<a href="PreparedDeleteServlet?parametroId=<%=negozioItem.getIdNegozio() %>">Delete</a>
						
					</td>
				
				</tr>
		<%	}%>
				<a href="insertNegozio.jsp">Insert Negozio</a>
			
	</table>
	
</body>
</html>