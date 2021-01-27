<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERIMENTO NEGOZIO</title>
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

</body>
</html>