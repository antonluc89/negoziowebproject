<%@page import="java.util.List"%>
<%@page import="it.negoziowebproject.model.Negozio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LISTA NEGOZI</title>
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
		<thead>
			<tr>
				<th>Nome</th>
				<th>Numero Articoli</th>
				<th>Azione</th>
				<th><a href="insertNegozio.jsp">Insert Negozio</a></th>
				
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
				
			
	</table>
	 </div>
</body>
</html>