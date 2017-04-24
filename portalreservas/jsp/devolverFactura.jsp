<%@page contentType="text/html; charset=utf-8"%>
<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<td class="home">
<div class="devolverFac">
<h1 class="mensajeConfirmacion"> FACTURA </h1>

<form method="post" action="/portalreservas/miwebfacturas/">

<label class="etiquetaFac">PRECIO TOTAL: </label><%=session.getAttribute("facturas_total")%><br><br>
<label>FECHA PAGO: </label><%=session.getAttribute("facturas_fechapago")%><br><br>
<label>FORMA PAGO: </label><%=session.getAttribute("facturas_formapago")%><br><br>
<label>CONTENIDO: </label><%=session.getAttribute("facturas_contenido")%><br><br>


<input class="botonesMenu"type="submit" value="CREAR PDF" onclick='alert("Se Ha Guardado En C:/Program Files/Apache Software Foundation/Apache Tomcat 7.0.34/webapps/portalreservas/facturas/")'></input>

</form>
</div>

</td>
</tr>

<%@include file="foot.jsp"%>