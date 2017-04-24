<%@page contentType="text/html; charset=utf-8"%>
<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>


<td class="home">
<div class="centro">
<h1 class="mensajeConfirmacion"> CONFIRMACION DE RESERVA </h1>







	<h1>Caracteristicas del hotel</h1>

	  <form action="/portalreservas/jsp/verUsuario.jsp" method="post">
	    <table class="table1" >   
			<tr class="tr1">
				<td class="td1"><label for="nombre">Nombre</label></td>
				<td class="td1"><input type="text" for="nombre" value="<%=usu.getNombre()%>"></input></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="apellido">Apellido</label></td>
				<td class="td1"><input type="text" for="apellido" value="<%=usu.getApellidos()%>"></input></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="dni">DNI</label></td>
				<td class="td1"><input type="text" for="dni" value="<%=usu.getDni()%>"></input></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="email">E-mail</label></td>
				<td class="td1"><input type="text" for="email" value="<%=usu.getEmail()%>"></input></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="direccion">Direccion</label></td>
				<td class="td1"><input type="text" for="direccion" value="<%=usu.getDireccion()%>"></input></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="cod_postal">Codigo Postal</label></td>
				<td class="td1"><input type="text" for="cod_postal" value="<%=usu.getCodigo_postal()%>"></input></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="ciudad">Ciudad</label></td>
				<td class="td1"><input type="text" for="ciudad" value="<%=usu.getCiudad()%>"></input></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="password">Administrador</label></td>
				<td class="td1"><input type="text" for="password" value="<%=usu.getPassword()%>"></input></td>
			</tr>
		</table>
			<div align="center">
			<button type="submit" value="volver" class="isa_success" class="center">Volver</button>
			<button type="submit" value="volver" class="isa_success" class="center" formaction="/portalreservas/">Guardar</button>
			</div>
	 </form>

</div>

</td>
</tr>

<%@include file="foot.jsp"%>