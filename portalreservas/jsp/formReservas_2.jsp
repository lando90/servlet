<%@ page language='java'%>
<%@ page import='java.util.*' %>
<%@ page import='reservas.*' %>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>
<td class="divform">

	<h1>Elija su habitacion</h1>
	
<%
  //Creamos los parametros iniciales
  //estos podrían proceder de un formulario, sql, etc...
 ArrayList<Habitacion> habs= (ArrayList)session.getAttribute("array_habitaciones"); //CAPTURO LAS Habitaciones
 int tam = habs.size(); //tamaño del array
 int id=0;
 String desc="";
 float precio=0;
 
 if(!habs.isEmpty()){
   %>    
 
                                                
    
 <form action="/portalreservas/miwebreservas/" method="post">
<!-- Creamos el inicio de la tabla manualmente-->
<table class = "table1">
 <tr>
    <th>seleccione:</th>
    <th>Tipo de habitacion</th>
    <th>Precio</th>
 </tr>
 <%
 //Iniciamos el bucle de las filas
 for(int i=0;i<tam;i++){
	 id=habs.get(i).getId();
	 desc=habs.get(i).getDescripcion();
	 precio= habs.get(i).getPrecio();
	 
	 %>
  <tr class="tr1">
    <td class="td1"><input type="radio" name="hab_seleccion" value="<%=id%>"></td>
    <td class="td1"><%=desc%></td>
    <td class="td1"><%=precio%></td>
  </tr>
  
  
<%  }%>
  <input type="text" id="flag" name="flag" value="3" class="flag" style="visibility:hidden">
  <input class="submit1" type="submit" value="Reservar" />
 <%}else{

 
 out.println("NO HAY HABITACIONES DISPONIBLES");
 %>
 <%
 }%>

 <!-- Cerramos tabla -->
 </table>
 
 
<input type="text" id="fecha_e" name="fecha_e" value="<%=session.getAttribute("fecha_e")%>"  style="visibility:hidden">
<input type="text" id="fecha_s" name="fecha_s" value="<%=session.getAttribute("fecha_s")%>"  style="visibility:hidden">
<input type="text" id="ninios" name="ninios" value="<%=session.getAttribute("ninios")%>"  style="visibility:hidden">

 
 </form>


</td>
</tr>
<%@include file="foot.jsp"%>