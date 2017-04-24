<%@ page language='java'%>
<%@ page import='java.util.*' %>
<%@ page import='reservas.*' %>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<td class="divform">
		<strong class="heading-3">RESERVA</strong>
		<form  action="/portalreservas/miwebreservas/" method="post">
			<br/>
			<table>
					<tr>
						<label>Hotel: 			
						<select id="hotel" name="hotel">
							<option value="" selected>Selecciona hotel</option>
								  <% 
								  ArrayList<Hotel> hoteles=new ArrayList<Hotel>();
								  String nombre;
								  hoteles=(ArrayList)session.getAttribute("array_hoteles");
								  for(int i=0;i<hoteles.size();i++){
								 nombre = ((Hotel)hoteles.get(i)).getNombre();
								
								  
								%> 
							<option value="<%=nombre%>"><%=nombre%></option>
							<%}%> 	  
						</select>
						</label>
					</tr>
					<br/>
					<tr>
						<label>Fecha de entrada: 			
						<input type="Date" id="fecha_e" name="fecha_e" value="" />
						</label>
					</tr>
					<br/>
					<tr>
						<label>Fecha de salida:			
							<input type="Date" id="fecha_s" name="fecha_s" value="" />
						 </label>
					</tr>
					<!--<br/>
					<div class="habitaciones">
						<label>Número Personas: 		
						<select name="habitaciones" id="habitaciones">
						  <option value="" id="habitaciones" selected>Selecciona habitacion</option>
						  <option value="1" id="habitaciones">individual</option>
						  <option value="2" id="habitaciones">doble</option>
						  <option value="3" id="habitaciones">triple</option>
						  <option value="4" id="habitaciones">cuadruple</option>
						</select>
						</label>

					<div class ="vistas">
						<label for="vistas">Vistas al mar: </label><br>	
						 <input type="radio" name="vistas" value="1" onclick="alertaVistas()" > Si
						 <input type="radio" name="vistas" value="0"> No
					</div>	
					<div class="ninios">
						<label for="ninios">Menores de 8 años: </label><br>	
						<input type="radio" id="ninios" name="ninios" value="0" selected > 0
						 <input type="radio" id="ninios" name="ninios" value="1" > 1
						 <input type="radio" id="ninios" name="ninios" value="2"> 2
					</div> 
					</label>		
					</div>	
					</div>	
					<br/>
					<div class="alojamiento">
					<label for="pension">Alojamiento: </label>
					<br>	
					<input type="checkbox" name="pension" value="mp"> Media pension<br>
					<input type="checkbox" name="pension" value="pc"> Pension completa<br>
					<input type="checkbox" name="pension" value="ti"> Todo incluido<br>
					<input type="checkbox" name="pension" value="d" > Desayuno<br>
					</div>
					<br/>



					<div class="garaje">
						<label for="garaje">Garaje: </label><br>	
						 <input type="radio" name="garaje" value="si" > Si
						 <input type="radio" name="garaje" value="no"> No
					</div> 
					<br/>
					<div class="pago">
						<label>Opciones de pago: 	
						<select name="pago">
						<option value="metalico">Metalico</option>
						<option value="tarjeta">Tarjeta</option>
						<option value="transferencia">Transferencia</option>
						  
						</select>
						</label>
					</div>
					-->
			<br/>
			<br/>
			<div class="boton">
			<input type="text" id="flag" name="flag" value="2" class="flag" style="visibility:hidden">
			<input class="submit" type="submit" value="Reservar" />
			</div>
			<br/>
		</form>
	</td>
</tr>
<%@include file="foot.jsp"%>