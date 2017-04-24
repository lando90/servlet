import java.util.*;

public class Productos{
	
	private int id;
	private String nombre;
	private float precio;
	private int cantidad;

public Productos(){}

public Productos(int id, String nombre, float precio, int cantidad){
	
	this.id=id;
	this.nombre=nombre;
	this.precio=precio;
	this.cantidad=cantidad;
	
}

public Productos(int id, String nombre, int cantidad){
	
	this.id=id;
	this.nombre=nombre;
	this.precio=0;
	this.cantidad=cantidad;
	
}

public int getId(){
	return this.id;
}

public String getNombre(){
	return this.nombre;
}

public float getPrecio(){
	return this.precio;
}

public int getCantidad(){
	return this.cantidad;
}

public void setId(){
	this.id=id;
}

public void setNombre(){
	this.nombre=nombre;
}

public void setPrecio(){
	this.precio=precio;
}

public void setCantidad(){
	this.cantidad=cantidad;
}


	
	
}