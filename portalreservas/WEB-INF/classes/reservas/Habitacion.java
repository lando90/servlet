package reservas;
import java.util.*;

public class Habitacion{
	
	private int id;
	private int id_hotel;
	private int piso;
	private int numero;
	private int con_vistas;
	private int camas;
	private float precio;
	private int personas;
	private int disponibles;
	private int num_hab;
	
	public Habitacion(){}
	
	public Habitacion(int id, int id_hotel, int piso, int con_vistas, int camas, float precio, int personas, int disponibles, int num_hab){
		this.id=id;
		this.id_hotel=id_hotel;
		this.piso=piso;
		this.con_vistas=con_vistas;	
		this.camas=camas;
		this.precio=precio;
		this.personas=personas;
		this.disponibles=disponibles;
		this.num_hab=num_hab;

	}
	
	public int getId(){
		return id;
	}
	
	public int getIdHotel(){
		return id_hotel;
	}
	
	public int getPiso(){
		return piso;
	}
	
	public int getNum_Hab(){
		return num_hab;
	}
	
	public int getConVistas(){
		return con_vistas;
	}
	
	public int getCamas(){
		return camas;
	}
	
	public float getPrecio(){
		return precio;
	}
	
	public int getPersonas(){
		return personas;
	}
	
	public int getDisponibles(){
		return disponibles;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setIdHotel(int id_hotel){
		this.id_hotel=id_hotel;
	}
	
	public void setPiso(int piso){
		this.piso=piso;
	}
	
	public void setNum_Hab(int num_hab){
		this.num_hab=num_hab;
	}
	
	public void setConVistas(int con_vistas){
		this.con_vistas=con_vistas;
	}
	
	public void setCamas(int camas){
		this.camas=camas;
	}
	
	public void setPrecio(float precio){
		this.precio=precio;
	}
	
	public void setPersonas(int personas){
		this.personas=personas;
	}
	
	public void setDisponibles(int disponibles){
		this.disponibles=disponibles;
	}
	
	public String getDescripcion(){
	///////Clase Barata
	if(this.piso<6 && this.personas == 1 && this.camas==1)
		return "Habitación individual";
	if(this.piso<6 && this.personas == 2 && this.camas==1)
		return "Habitación doble estándar (1 cama)";
	if(this.piso<6 && this.personas == 2 && this.camas==2)
		return "Habitación doble superior (2 camas)";
	if(this.piso<6 && this.personas == 3 && this.camas==2)
		return "Habitación doble superior (2 camas)";
	if(this.piso<6 && this.personas == 4 && this.camas==2)
		return "Habitación doble superior (2 camas)";
	if(this.piso<6 && this.personas == 3 && this.camas==3)
		return "Habitación triple estándar";
	if(this.piso<6 && this.personas == 4 && this.camas==3)
		return "Habitación triple superior";
	if(this.piso<6 && this.personas == 4 && this.camas==4)
		return "Habitación cuádruple estándar";
	
	//////Medio Cara
	if(this.piso>5 && this.piso<9 && this.personas == 1 &&  this.camas==1)
		return "Suite individual";
	if(this.piso>5 && this.piso<9 && this.personas == 2 && this.camas==1)
		return "Suite doble estándar (1 cama)";
	if(this.piso>5 && this.piso<9 && this.personas == 2 && this.camas==2)
		return "Suite doble superior (2 camas)";
	if(this.piso>5 && this.piso<9 && this.personas == 3 && this.camas==2)
		return "Suite doble superior (2 camas)";
	if(this.piso>5 && this.piso<9 && this.personas == 4 && this.camas==2)
		return "Suite doble superior (2 camas)";
	if(this.piso>5 && this.piso<9 && this.personas == 3 && this.camas==3)
		return "Suite triple estándar";
	if(this.piso>5 && this.piso<9 && this.personas == 4 && camas==3)
		return "Suite triple superior";
	if(this.piso>5 && this.piso<9 && this.personas == 4 && this.camas==4)
		return "Suite cuádruple superior";
	
	//////Para ricos y famosos
	if(this.piso>8 &&  camas==1)
		return "Suite individual Delux";
	if(this.piso>8 && this.personas == 2 && this.camas==1)
		return "Suite doble estándar Delux (1 cama)";
	if(this.piso>8 && this.personas == 2 && this.camas==2)
		return "Suite doble superior Delux (2 camas)";
	if(this.piso>8 && this.personas == 3 && this.camas==2)
		return "Suite doble superior Delux (2 camas)";
	if(this.piso>8 && this.personas == 4 && this.camas==2)
		return "Suite doble superior Delux (2 camas)";
	if(this.piso>8 && this.personas == 3 && this.camas==3)
		return "Suite triple estándar Delux";
	if(this.piso>8 && this.personas == 4 && this.camas==3)
		return "Suite triple superior Delux";
	if(this.piso>8 && this.personas == 4 && this.camas==4)
		return "Suite cuádruple superior Delux";
	
	return null;
}
}