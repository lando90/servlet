<%@page contentType="text/html; charset=utf-8"%>
<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<td class="home">




<div class="galeria">
<strong class="heading-3">Buscar ofertas</strong>
</div>
<div class = "busqueda">
<form action="/web/landingPageRedirect.do" id="search-land" method="get" class="search-content">
	<table border="1" style="width: 400px;">
	<tr>
		<td>
			Encuentra ofertas para todas las temporadas
		</td>
	<tr>
		<td>	
		<fieldset class="clearfix">
		 
			<!--non-accesible view-->
		   <div class="non-accessible">
				<div class="fl-left">
					<label class="placeholder" for="text-from-visible">Pais</label>
						<input type="text" id="text-from-visible" name="text_origen" title="De" value="" class="market-change-advice force-destinies-load" autocomplete="off">												
						<input type="hidden" id="text-from" name="origen" value="">
						<input type="hidden" id="text-from-country" name="text-from-country" value="ES">
				</div>  
				<div class="fl-left">
					<label class="placeholder" for="text-from-visible">Fecha de check-in</label>
						<input type="date" id="text-from-visible" name="text_origen" title="De" value="" class="market-change-advice force-destinies-load" autocomplete="off">												
						<input type="hidden" id="text-from" name="origen" value="">
						<input type="hidden" id="text-from-country" name="text-from-country" value="ES">
				</div>  
				<div class="fl-right">
					<label class="placeholder" for="text-to-visible">Fecha de check-out</label>
						<input type="date" id="text-to-visible" name="text_destino" title="A" value="" autocomplete="off">
						<input type="hidden" id="text-to" name="destino" value="">
						<a href="#" title="Ver otros destinos" class="view-select" tabindex="-1"></a>
				</div>  
		   	</div>
		   	<!--END non-accesible view-->
		   	<!--action-->
		 	<div >	 
				<div class="fl-right">
					<input class="buscarBoton" type="submit" value="Encuéntralo">
			 	</div>
		 	</div> 
			<!--END action-->
		</fieldset>
		</td>
		</tr>
		</table>
		</form>
</div>


</td>
</tr>

<%@include file="foot.jsp"%>