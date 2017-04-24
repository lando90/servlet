<%@ page language='java' contentType='text/html;charset=iso-8859-1'%>
<%@ page import='java.util.Date' %>
<%@ page import='hotel.*' %>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<td class="divform">
		<strong class="heading-3">RESERVA</strong>
		<form  action="" method="post">
			<br/>
			<!-- <%ArrayList<Hotel> hoteles;%>
			<%hoteles=(ArrayList)session.getAttribute("hotel");%>
			<%ArrayList<Habitaciones> habitaciones;%>
			<%habitaciones=(ArrayList)session.getAttribute("habitaciones");%> -->
			<div class="hotel">
				<label>Hotel: 			
				<select id="hoteles" name="hoteles">
					<option value="" selected>Selecciona hotel</option>
						<!-- <%for(int i = 0; i<hoteles.size();i++){
						String nombre = hoteles.get(i).getNombre();
						%> -->
					<option value="<%=nombre%>" ><%=nombre%></option>
					<%}%>
				</select>
				</label>
			</div>
			<br/>
			<div class="fecha_entrada">
				<label>Fecha de entrada: 			
				<input type="Date" id="fecha_e" name="fecha_e" value="" />
				</label>
			</div>
			<br/>
			<div class="fecha_salida">
				<label>Fecha de salida:			
					<input type="Date" id="fecha_s" name="fecha_s" value="" />
				 </label>
			</div>
			<br/>
			<div class="habitaciones">
				<label>Habitacion: 		
				<select name="habitaciones" id="habitaciones">
				  <option value="" selected>Selecciona habitacion</option>
					<!-- <%for(int i = 0; i<hoteles.size();i++){
						if(hoteles.get(i).getNombre.equalsIgnoreCase(document.forma.hoteles.options[i].value.selected))
							int idHotel = new Integer(hoteles.get(i).getId());
						for(int j=0;j<habitaciones.size();j++){
							if(habitaciones.get(i).getId_Hotel().equals(idHotel)){
								habitaciones.get(i).getNumhab();
							}
						}
					%> -->
						<option value="<%=h%>" ><%=h%></option>
					<%}%>
				</select>
				</label>

			<div class ="vistas">
				<label for="vistas">Vistas al mar: </label><br>	
			 	 <input type="radio" name="vistas" value="1" onclick="alertaVistas()" > Si
			 	 <input type="radio" name="vistas" value="0"> No
			</div>	
			<div class="ninios">
			<label >niños(menores de 8 años): 
				<select  name="ninios" id="ninios" onchange="alertaninios()">
					<option id="0" selected value="0"></option>
					<option id="1" value="1">1</option>
					<option id="2" value="2">2</option>
				</select >
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
			<br/>
			<br/>
			<div class="boton">
			<input class="submit" type="submit" value="Reservar" />
			</div>
			<br/>
		</form>
	</td>
</tr>
<%@include file="foot.jsp"%>