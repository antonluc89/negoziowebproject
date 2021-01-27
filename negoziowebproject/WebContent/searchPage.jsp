<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEARCH PAGE</title>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<body>
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		Inserire dato per trovare Negozi con numero articoli maggiore del dato inserito<br>
	<%}    %>
	<div class="input-group mb-3">
	<form action="SearchServlet" method="post">
		<label for="numeroArticoliId">Numero Articoli:</label><br>
		<input type="text" name="numeroArticoliInput" id="numeroArticoliInputId">
		<br><br>
		<input type="submit" value="SEARCH">
			<br><br>
			</form>

</div>
</body>
</html>