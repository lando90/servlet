package utilidades;

import java.sql.*;
import javax.servlet.http.*;

	public class GestionClientes {
		Datos dt;
		public GestionClientes(String midriver, String cadenacon) {
			dt=new Datos(midriver,cadenacon);
		}
		public boolean validar(String usuario, String password){
			boolean estado=false;
			try{
			Connection cn=dt.dameConexion();
			//instrucción SQL para obtener los datos
			//del usuario indicado
			
			
			String query = "select * from usuario ";
			query+="where password ='"+password;
			query+="' and email='"+usuario+"'";
			Statement st =cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			estado= rs.next();
			dt.closeConnection(cn);
			}
			catch(Exception e){
			e.printStackTrace();
			}
			finally{
			return estado;
			}
			}
			
			public boolean esAdmin(String usuario, String password){
			boolean estado=false;
			try{
			Connection cn=dt.dameConexion();
			//instrucción SQL para obtener los datos
			//del usuario indicado
			
			
			String query = "select * from usuario ";
			query+="where password ='"+password;
			query+="' and email='"+usuario;
			query+="' and Administrador=1"; 
			Statement st =cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			estado= rs.next();
			dt.closeConnection(cn);
			}
			catch(Exception e){
			e.printStackTrace();
			}
			finally{
			return estado;
			}
			}
					
			
			public boolean registrar(String nombre, String apellidos,String dni,String email,String direccion,String codigo_postal,String password,String ciudad,int administrador){
			//genera la instrucción SQL de inserción a partir
			//de los datos almacenados en el JavaBean Usuario
			boolean estado=true;
			try{
			Connection cn=dt.dameConexion();
			PreparedStatement ps;
			ps=cn.prepareStatement("insert into usuario(nombre,apellidos,dni,email,direccion,codigo_postal,password,ciudad,administrador) values(?,?,?,?,?,?,?,?,?)");
					
					ps.setString(1,nombre);
					ps.setString(2,apellidos);
					ps.setString(3,dni);
					ps.setString(4,email);
					ps.setString(5,direccion);
					ps.setString(6,codigo_postal);
					ps.setString(7,password);
					ps.setString(8,ciudad);
					ps.setInt(9,administrador);	
				
				
			
			
			ps.execute();
			
			dt.closeConnection(cn);
			}

			catch(Exception e){e.printStackTrace();
			
			estado=false;
			}
			return estado;
			}
	}