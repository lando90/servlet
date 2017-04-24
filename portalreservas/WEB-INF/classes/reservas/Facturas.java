import java.sql.Date;
//import java.util.*;
import java.io.*;

public class Facturas  {
	int id;
	int id_reserva;
	float total;
	Date fecha_pago;
	String forma_pago;
	String contenido;
		
	public void Facturas(){
		
	}
	
	public Facturas (int id, int id_reserva, float total, Date fecha_pago, String forma_pago, String contenido){
		this.id=id;
		this.id_reserva=id_reserva;
		this.total=total;
		this.fecha_pago=fecha_pago;
		this.forma_pago=forma_pago;
		this.contenido=contenido;
	}
	
	public Facturas (int id, int id_reserva, float total, String fecha_pago, String forma_pago, String contenido){
		this.id=id;
		this.id_reserva=id_reserva;
		this.total=total;
		this.fecha_pago=Date.valueOf(fecha_pago);
		this.forma_pago=forma_pago;
		this.contenido=contenido;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return this.id;
	}
		
	public void setId_reserva(int id_reserva){
		this.id_reserva=id_reserva;
	}
	
	public int getId_reserva(){
		return this.id_reserva;
	}	
	
	public void setTotal(float total){
		this.total=total;
	}
	
	public float getTotal(){
		return this.total;
	}
	
	public void setFecha_pago(Date fecha_pago){
		this.fecha_pago=fecha_pago;
	}
	
	public Date getFecha_pago(){
		return this.fecha_pago;
	}
	
	public void setFecha_pago(String fecha_pago){
		this.fecha_pago=Date.valueOf(fecha_pago);
	}
	
	public String getFecha_pagoString(){
		return this.fecha_pago.toString();
	}
	
	public void setForma_pago(String forma_pago){
		this.forma_pago=forma_pago;
	}
	
	public String getForma_pago(){
		return this.forma_pago;
	}
		
	public void setContenido(String contenido){
		this.contenido=contenido;
	}
	
	public String getContenido(){
		return this.contenido;
	}
	
}