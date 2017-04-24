<%@page contentType="text/html; charset=utf-8"%>
<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<script type="text/javascript">
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var y = document.getElementsByClassName("info");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
  for (i = 0; i < y.length; i++) {
     y[i].style.display = "none";  
  }
  y[slideIndex-1].style.display = "block";  
}
</script>

<td class="home">
<div class="confirmRes">
<h1 class="mensajeConfirmacion"> NUESTROS HOTELES</h1>

<div class="w3-content w3-display-container" >
	<div>
			<img class="mySlides" style="width:50%; display:inline" src="../img/Hotel1.jpg" ​>
			<img class="mySlides" style="width:50%; display:none" src="../img/Hotel2.jpg" ​>
			<img class="mySlides" style="width:50%; display:none" src="../img/Hotel3.jpg">
			<button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
			<button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
	</div>
	<div>	
		<label class="info"style="width:50%; display:inline">Situado sobre la paradisíaca playa de Arena Gorda, el Hotel Riu Palace Punta Cana pone a tu disposición todas las facilidades
		que necesitas para que tu escapada sea inolvidable. Este hotel en Punta Cana con Todo Incluido cuenta con WiFi gratuito, servicio de habitaciones 24 horas y un sinfín de opciones 
		culinarias para que disfrutes de la mejor gastronomía durante tus vacaciones con RIU Hotels & Resorts.</label>
	
		
		<label class="info"style="width:50%; display:none">El resort ártico de Kakslauttanen en Finlandia asegura ser el “más encantador de toda Laponia”, y si tenemos que hacer justicia 
		a las fotos de los iglús con el techo de cristal para ver las auroras boreales hay que darles la razón. El lugar es increíble. Kakslauttanen está a unos 250 kilómetros al norte 
		del Círculo Polar Ártico y aunque está un poco alejado de todo, no es difícil llegar con el aeropuerto de Ivalo a 30 minutos.</label>
		
		<label class="info"style="width:50%; display:none">Este resort moderno con todo incluido está ubicado en la playa, a 3,9 km del acuario interactivo de Cancún y a 8 km de los artefactos arqueológicos del Museo Maya de Cancún. 
Las habitaciones, elegantes y refinadas, tienen balcones, televisiones de pantalla plana, minibares y dispensadores de bebidas alcohólicas. Algunas también cuentan con vistas al mar. Por su parte, las suites incluyen bañeras de hidromasaje y salas de estar con sofás cama. Servicio de habitaciones disponible.
Entre las instalaciones destacan 10 restaurantes y bares (incluidos uno italiano y otro asiático), un club nocturno, 3 piscinas exteriores, una piscina infinita, un jacuzzi y un spa. Las tarifas del resort incluyen espectáculos, catamaranes, equipo de esnórquel y una clase introductoria de submarinismo.</label>
		
		

  
  </div>
</div>
<!--
<table border="1">
	
	<tr>
		<td>
		<img class="mySlides" src="../img/Hotel1.jpg">
		<img class="mySlides" src="../img/Hotel2.jpg">
		<img class="mySlides" src="../img/Hotel3.jpg">
		<!--<button class="w3-button w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
		<button class="w3-button w3-display-right" onclick="plusDivs(+1)">&#10095;</button>
			
		</td>
		<!--
		<td>
			<div class="hot">
				<img src="../img/Hotel1.jpg" />
				<p>Situado sobre la paradisíaca playa de Arena Gorda, el Hotel Riu Palace Punta Cana pone a tu disposición todas las facilidades que necesitas para que tu escapada sea inolvidable. Este hotel en Punta Cana con Todo Incluido cuenta con WiFi gratuito, servicio de habitaciones 24 horas y un sinfín de opciones culinarias para que disfrutes de la mejor gastronomía durante tus vacaciones con RIU Hotels & Resorts.</p>
			</div>
		</td>
	
		<td>
			<div class="hot">
				<img src="../img/Hotel2.jpg" />
				<p></p>
			</div>
		</td>

		<td>
			<div class="hot">
				<img src="../img/Hotel3.jpg" />
				<p> </p>
			</div>
		</td>
		
	</tr>
</table>-->
</div>

</td>
</tr>

<%@include file="foot.jsp"%>