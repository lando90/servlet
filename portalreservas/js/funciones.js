function alertaninios(){
				alert("se incluiran tantas camas supletorias como niños haya");
		}

function alertaVistas(){
				alert("esta opcion tendra un recargo del 11%");
		}
function alertaLogout(){
		alert("La desconexion se ha realizado con exito");
}
function mostrarlogin(){
	if(document.getElementById('signup').style.display === 'block'){
		document.getElementById('signup').style.display = 'none'
	}
	if(document.getElementById('login').style.display === 'none'){
		document.getElementById('login').style.display = 'block';	
	}
	else{
	document.getElementById('login').style.display ='none';	
	}
}
		
function mostrarsignup(){
	if(document.getElementById('login').style.display === 'block'){
		document.getElementById('login').style.display = 'none'
	}
	if(document.getElementById('signup').style.display === 'none'){
		document.getElementById('signup').style.display = 'block';
	}
	else{
	document.getElementById('signup').style.display ='none';	
	}
}
function ocultarbotonl(){
	document.getElementById().style.display = 'none';
}
function ocultarbotons(){
	document.getElementById().style.display = 'none';
}