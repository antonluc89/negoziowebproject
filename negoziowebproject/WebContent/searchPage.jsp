<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEARCH PAGE</title>
</head>
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
<body>
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		Inserire dato per trovare Negozi con numero articoli maggiore del dato inserito<br>
	<%}    %>
	<form action="SearchServlet" method="post">
		<label for="numeroArticoliId">Numero Articoli:</label><br>
		<input type="text" name="numeroArticoliInput" id="numeroArticoliInputId">
		<br><br>
		<input type="submit" value="SEARCH">
			<br><br>
			</form>


</body>
</html>