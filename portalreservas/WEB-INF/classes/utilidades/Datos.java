package utilidades;
import java.sql.*;


public class Datos {
	private String midriver;
	private String cadenacon;
	private Connection cn;
	
	
public Datos() {
}

public Datos(String midriver,String cadenacon){
	//almacena los datos para la conexión
	//con la base de datos
	this.midriver=midriver;
	this.cadenacon=cadenacon;
}

public Connection dameConexion() throws SQLException{
	
	try{
		Class.forName(midriver).newInstance();
		cn=DriverManager.getConnection(cadenacon);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return cn;
}


public void closeConnection(Connection cn){
	try{
	if(cn!=null && !cn.isClosed()){
		cn.close();
		}
	}
	catch(SQLException e){
	e.printStackTrace();
	}
}
}