
<tr>
	<td class="menu">
	
		<div class="topnav">
		  <a class="active">MENU</a>
		</div>
		
		<div class="topnav">
			<form action="/portalreservas/miweb/" method="post">
				<input type="text" id="opcion" name="opcion" value="3" class="opcion"style="visibility:hidden">
				<input class="botonesMenu" type="submit" value="Inicio"></input>
			</form>
		</div>
	
		<div class="topnav">
			<form action="/portalreservas/miwebreservas/" method="post">
				<input type="text" id="flag" name="flag" value="1" class="flag" style="visibility:hidden">
				<input class="botonesMenu" type="submit" value="Reservas"></input>
			</form>
		</div>
		<div class="topnav">
			<form action="../jsp/hoteles.jsp" method="post">
				<input class="botonesMenu" type="submit" value="Hoteles"></input>
			</form>
		</div>
		<div class="topnav">
			<form action="/portalreservas/miwebfacturas/" method="post">

				<input class="botonesMenu" type="submit" value="Facturas"></input>
			</form>
		</div>

	</td>