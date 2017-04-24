<%@page contentType="text/html; charset=utf-8"%>
<%@ page import='reservas.*' %>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/estiloJSP.css" type="text/css"></link>
<link rel="stylesheet" href="../css/reserva.css" type="text/css"></link>
<script type="text/javascript" src="../js/funciones.js"></script>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
</head>
<body>
<table >
	<tr>
		<td class="head" width="10%">
			<!--<div class="titulo">-->
				
				<input class="boton_sopra" type="submit" value="">

			<!--</div>-->
			
		</td>
		<td class="head" width="89%">
		<font size="6">SOPRA STERIA RESORTS</font>
		</td>
		<td class="headboton">
		<!--<div class="divMenuLateral">-->
			<form action="/portalreservas/jsp/verUsuario.jsp" method="post">
				<input class="botonesMenuSup" type="submit" value="Mi perfil"></input>
			</form>
		<!--</div>-->
		</td>
		<td class="headboton">
		<!--<div class="divMenuLateral">-->
			<form action="/portalreservas/miwebfrontal/" method="post">
				<input class="botonesMenuSup" type="submit" value="Log out" onclick="alertaLogout()"></input>
			</form>
		<!--</div>-->
		</td>

		
	</tr>
	</table>
	<table>