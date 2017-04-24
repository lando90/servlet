package reservas;
import java.sql.*;
import java.util.*;

public class Demo{


 public static void main(String[] args){
	 
	 //Atributos conectar Sql
		Connection con=null;
		Statement st;
		ResultSet rs;
		PreparedStatement ps;
		String driver_cad="com.mysql.jdbc.Driver";
		
		//getInitParameter para meter la cadena, la cadena de abajo es la del init
		//String cadena_conex="jdbc:mysql://localhost:3306/proyectohotel?user=root&amp;password=root";
		//Datos dt=new Datos(driver_cad,cadena_conex);
		
	
		try{
		Class.forName(driver_cad);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectohotel","root","root");
		if(con==null)System.out.println("NO");
		}catch(Exception ex){}
		
		
		System.out.println("/////////////Login/////////////");
		System.out.println("//////////////////////////////");
		
 
	}
}