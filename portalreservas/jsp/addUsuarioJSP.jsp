<%@page contentType="text/html; charset=utf-8"%>
<%@include file="headAdmin.jsp"%>
<%@include file="menuAdmin.jsp"%>

<td class="home">
<div class=divGeneral>
<br>
<br>
<div class="tituloReserva">
<h1> AÑADIR USUARIO</h1>
<div id="signup" class="signup" >
  					<form class="signupform"  action="/portalreservas/paneladmin/" method="post">
					<label for="nombre">NOMBRE:</label><input type="text" name="nombre" id="nombre" required><br><br>
					<label for="apellidos">APELLIDOS:</label><input type="text" name="apellidos" id="apellidos" required><br><br>
					<label for="dni">DNI:</label><input type="text" name="dni" id="dni" required><br><br>
					<label for="email">EMAIL:</label><input type="text" name="email" id="email" required><br><br>
					<label for="direccion">DIRECCION:</label><input type="text" name="direccion" id="direccion" required><br><br>
					<label for="codigopostal">CODIGO POSTAL:</label><input type="number" name="codigo_postal" id="codigopostal" required><br><br>
					<label for="password">CONTRASEÑA:</label><input type="password" name="password1" id="password1" required><br><br>
					<label for="ciudad">CIUDAD:</label><input type="text" name="ciudad" id="ciudad" required><br><br>
					<input type="submit" name="registrarse" value="REGISTRARSE" class="submit">
  				</form> 
  			</div>	
</div>
<br>
<br>
<br>

</td>
</tr>

<%@include file="foot.jsp"%>