package reservas;
import java.util.*;
import java.io.*;

public class Hotel{
	
	private int id;
	private String nombre;
	private String categoria;
	private String direccion;
	private String zona;
	
	
	public Hotel(int id, String nombre, String categoria, String direccion, String zona){
		
		this.id=id;
		this.nombre=nombre;
		this.categoria=categoria;
		this.direccion=direccion;
		this.zona=zona;
			
		
		
	}
	
	public Hotel(){}
	public void setId(int id){
		this.id=id;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;		
	}
	public void setCategoria(String categoria){
		this.categoria=categoria;
	}
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public void setZona(String Zona){
		this.zona=zona;
	}
		
	public int getId(){
		return this.id;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public String getCategoria(){
		return this.categoria;
	}
	
	public String getDireccion(){
		return this.direccion;
	}
	
	public String getZona(){
		return this.zona;
	}
	
		
}