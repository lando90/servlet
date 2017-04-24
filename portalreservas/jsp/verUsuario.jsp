<%@page contentType="text/html; charset=utf-8"%>
<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>


<td class="home">
<div class="centro">
<h1 class="mensajeConfirmacion"> CONFIRMACION DE RESERVA </h1>







	<h1>Caracteristicas del hotel</h1>

	  <form action="/portalreservas/jsp/JSPFrontal.jsp" method="post">
	    <table class="table1" >   
			<tr class="tr1">
				<td class="td1"><label for="nombre">Nombre</label></td>
				<td class="td1"><label for="nombre"><%=usu.getNombre()%></label></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="apellido">Apellido</label></td>
				<td class="td1"><label for="apellido"><%=usu.getApellidos()%></label></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="dni">DNI</label></td>
				<td class="td1"><label for="dni"><%=usu.getDni()%></label></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="email">E-mail</label></td>
				<td class="td1"><label for="email"><%=usu.getEmail()%></label></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="direccion">Direccion</label></td>
				<td class="td1"><label for="direccion"><%=usu.getDireccion()%></label></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="cod_postal">Codigo Postal</label></td>
				<td class="td1"><label for="cod_postal"><%=usu.getCodigo_postal()%></label></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="ciudad">Ciudad</label></td>
				<td class="td1"><label for="ciudad"><%=usu.getCiudad()%></label></td>
			</tr>
			<tr class="tr1">
				<td class="td1"><label for="admin">Administrador</label></td>
				<td class="td1"><label for="admin"><%=usu.esAdministrador()%></label></td>
			</tr>
		</table>
			<div align="center">
			<button type="submit" value="volver" class="isa_success" class="center">Volver</button>
			<button value="volver" class="isa_success" class="center" formaction="/portalreservas/jsp/editarUsuario.jsp">Editar</button>
			</div>
	 </form>

</div>

</td>
</tr>

<%@include file="foot.jsp"%>