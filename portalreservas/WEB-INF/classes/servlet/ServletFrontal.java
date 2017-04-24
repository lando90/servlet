package servlet;
import utilidades.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import java.net.*;
import java.io.IOException;

public class ServletFrontal extends HttpServlet{
	HttpSession misesion;
	Connection con;
	Statement st;
	//Usuario usuario = null;
	RequestDispatcher rd;
	//GestionClientes gc;
	Datos dt;
	
	public void init(ServletConfig config){
		try{
		super.init(config);
		String cadena = config.getInitParameter("cadenaConex");
		String driver = config.getInitParameter("driver");
	
		//gc = new GestorClientes(driver,cadena);
		
	
		dt=new Datos(driver,cadena);
		con=dt.dameConexion();
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error dentro de Init en ServletFrontal");
		}
		

	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
				
		try{
			rd=req.getRequestDispatcher("/html/inicio.html");
			rd.forward(req,res);

		}
		catch(Exception sqle){
			System.out.println("Error dentro de Post en ServletFrontal");
			
	}
	}
	
	public void destroy(){
		
	}


}