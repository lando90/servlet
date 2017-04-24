<%@page contentType="text/html; charset=utf-8"%>
<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>
<%@ page import='java.util.*' %>

<td class="divform">


<strong class="heading-3">CONFIRMACION DE RESERVA</strong>
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
						<input type="text" id="hotel" name="hotel" value="<%=session.getAttribute("nombre")%>" disabled />
					</td>
				</tr>
				<tr>
					<td><b>Fecha de entrada:</b></td>
					<td>
						<input type="Date" id="fecha_e" name="fecha_e" value="<%=session.getAttribute("fecha_e")%>" disabled />
					</td>
					<td><b>Fecha de salida:</b></td>
					<td>
						<input type="Date" id="fecha_s" name="fecha_s" value="<%=session.getAttribute("fecha_s")%>" disabled />
					</td>
				</tr>
				
				<tr>
					<td><b>Número habitaciones:</b></td>
					<td>
						<%
						String nombre="";
						switch(((Integer)session.getAttribute("habitaciones")).intValue()){
							case (1): nombre="habitacion individual";
								break;
							case (2):nombre="habitacion doble";
								break;
							case (3): nombre="habitacion individual";
								break;
							case (4): nombre="habitacion individual";
								break;
							default:
								break;
							
						}
						%>
						<input type="text" id="habitaciones" name="habitaciones" value="<%=nombre%>" disabled />
					</td>
					<td><b>Menores de 8 años: </b></td>
					<td>
						<input type="text" id="ninios" name="ninios" value="<%=session.getAttribute("ninios")%>" disabled />
					</td>
				</tr> 
				<tr>
					<td><b>Pension: </b></td>	
					<td>
						<%=session.getAttribute("pension")%>
					</td>
				</tr>	
				<tr>
					<td><b>Garaje: </b></td>	
					<td>
						<%=session.getAttribute("garaje")%>
					</td>
				</tr>	
				<tr>
					<td><b>Pago: </b></td>	
					<td>
						<input type="text" id="pago" name="pago" value="<%=session.getAttribute("senal")%>" disabled />
					</td>
				</tr>	
				<tr>
					<td><b>Vistas: </b></td>	
					<td>
						<%=session.getAttribute("con_vistas")%>
					</td>
				</tr>			
				
	
				<tr>
					<td>
					</td>
					<td>
						<input type="text" id="flag" name="flag" value="4" class="flag" style="visibility:hidden">
						<input class="botonesMenu"type="submit" value="CONFIRMAR"></input>
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