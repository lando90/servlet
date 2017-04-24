<%@ page language='java'%>
<%@ page import='java.util.*' %>
<%@ page import='reservas.*' %>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<td class="divform">
		<strong class="heading-3">RESERVA</strong>
		<form  action="/portalreservas/miwebreservas/" method="post">
		
			<table style="opacity:0.9; border-radius:9px;margin-top: 50px;" bgcolor= "#FFFFFF">
				
				<tr>
					<td><b></b></td>
					<td><b></b></td>
					<td><b></b></td>
				</tr>
				<tr>
					<td><b></b></td>
					<td><b></b></td>
					<td><b></b></td>
				</tr>
				<tr>
					<td><b></b></td>
					<td><b></b></td>
					<td><b></b></td>
				</tr>
				<tr>
					<td><b></b></td>
					<td><b></b></td>
					<td><b></b></td>
				</tr>
				<tr>
					<td><b>Hotel:</b></td>
					<td>
						<select id="hotel" name="hotel" required>
							<option value="" selected>Selecciona hotel</option>
								  <% 
								  ArrayList<Hotel> hoteles=new ArrayList<Hotel>();
								  String nombre;
								  hoteles=(ArrayList)session.getAttribute("array_hoteles");
								  for(int i=0;i<hoteles.size();i++){
								 nombre = ((Hotel)hoteles.get(i)).getNombre();
								System.out.println(nombre);
								  
								%> 
							<option value="<%=nombre%>"><%=nombre%></option>
							<%}%> 	  
						</select>
					</td>
				</tr>
				<tr>
					<td><b>Fecha de entrada:</b></td>
					<td>
						<input type="Date" id="fecha_e" name="fecha_e" value="" required />
					</td>
					<td><b>Fecha de salida:</b></td>
					<td>
						<input type="Date" id="fecha_s" name="fecha_s" value="" required/>
					</td>
				</tr>
				
				<tr>
					<td><b>Número Personas:</b></td>
					<td>
						<select name="habitaciones" id="habitaciones"required>
						  <option value="" id="habitaciones" selected>Selecciona habitacion</option>
						  <option value="1" id="habitaciones">individual</option>
						  <option value="2" id="habitaciones">doble</option>
						  <option value="3" id="habitaciones">triple</option>
						  <option value="4" id="habitaciones">cuadruple</option>
						</select>
					</td>
					<td><b>Menores de 8 años: </b></td>
					<td>
						<select name="ninios" id="ninios"required>
							<option value="0" id="ninios"selected>0</option>
							<option value="1" id="ninios">1</option>
							<option value="2" id="ninios">2</option>
							<option value="3" id="ninios">3</option>
							<option value="4" id="ninios">4+</option>
						</select>
					</td>
				</tr> 
				<tr>
					<td><b>Vistas al mar: </b></td>	
					<td>
						<input type="radio" name="vistas" value="1" onclick="alertaVistas()" > Si
						<input type="radio" name="vistas" value="0" checked> No
					</td>
				</tr>	
				
						
				<tr>
					<td><b>Alojamiento: </b></td>
					<td>
						
						<select name="pension" id="pension"required>
							<option value="" id="pension"selected>Seleccione tipo</option>
							<option value="mp" id="pension">Media pension</option>
							<option value="pc" id="pension">Pension completa</option>
							<option value="ti" id="pension">Todo incluido</option>
							<option value="d" id="pension">Desayuno</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><b>Garaje: </b></td>
					<td>
						<input type="radio" name="garaje" value="si" > Si
						<input type="radio" name="garaje" value="no" checked> No
					</td>
				</tr>
				<tr>
					<td><b>Opciones de pago: </b></td>
					<td>
						<select name="pago"required>
							<option value="metalico">Metalico</option>
							<option value="tarjeta">Tarjeta</option>
							<option value="transferencia">Transferencia</option>
						</select>
					</td>
				</tr>
	
				<tr>
					<td>
					</td>
					<td>
						
							<input type="text" id="flag" name="flag" value="2" class="flag" style="visibility:hidden">
							<input  type="submit" value="Reservar" />
						
					</td>
					<td>
					</td>
				</tr>
			</table>
			<br/>
			<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
			<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
			
		</form>
	</td>
</tr>
<%@include file="foot.jsp"%>