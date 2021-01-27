<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERIMENTO NEGOZIO</title>
</head>
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

<form action="InsertServlet" method="post">
		<label for="nomeInputId">NOME:</label><br>
		<input type="text" name="nomeInput" id="nomeInputId">
		<br>
		<label for="partitaIvaInputId">PARTITA IVA:</label><br>
		<input type="text" name="partitaIvaInput" id="partitaIvaInputId">
		<br>
		<label for="numeroArticoliInputId">NUMERO ARTICOLI:</label><br>
		<input type="text" name="numeroArticoliInput" id="numeroArticoliInputId">
		<br>
		<label for="indirizzoInputId">INDIRIZZO:</label><br>
		<input type="text" name="indirizzoInput" id="indirizzoInputId">
		<br>
		<label for="numeroTelefonicoInputId">NUMERO TELEFONICO:</label><br>
		<input type="text" name="numeroTelefonicoInput" id="numeroTelefonicoInputId">
			<br><br>
	<input type="submit" value="INSERT">
	</form>
</table>
</div>
</body>
</html>