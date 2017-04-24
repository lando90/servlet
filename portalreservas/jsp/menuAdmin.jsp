<%@page contentType="text/html; charset=utf-8"%>
<tr>
	<td class="menu">
		<div class="topnav">
		  <a class="active">MENU</a>
		</div>
		<div class="topnav">
			<form action="../jsp/addUsuarioJSP.jsp" method="post">
				<input class="botonesMenu" type="submit" value="ADD USUARIO"></input>
			</form>
		</div>
		<div class="topnav">
			<form action="post" method="formularioJSP">
				<input class="botonesMenu" type="submit" value="ADD HOTELES"></input>
			</form>
		</div>
				<div class="topnav">
			<form action="post" method="irAReservasJSP">
				<input class="botonesMenu" type="submit" value="FACTURAS"></input>
			</form>
		</div>
		<div class="topnav">
			<form action="post" method="irAReservasJSP">
				<input class="botonesMenu" type="submit" value="MI PERFIL"></input>
			</form>
		</div>
	</td>