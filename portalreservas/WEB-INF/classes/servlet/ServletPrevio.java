package servlet;
import utilidades.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import reservas.*;

public class ServletPrevio extends HttpServlet{
	

	Connection con;
	Statement st;
	PreparedStatement ps;
	GestionClientes gc;
	Usuario usuarioconectado;
	Datos dt;
	
	
	
	public void init(ServletConfig config){
		try{
		super.init(config);
		String cadena = config.getInitParameter("cadenaConex");
		String driver = config.getInitParameter("driver");
		
	
		gc = new GestionClientes(driver,cadena);

		dt=new Datos(driver,cadena);
		con=dt.dameConexion();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
			
			
			
		try{	
				HttpSession sesion=req.getSession();
				int op = Integer.parseInt(req.getParameter("opcion"));
				if(op==1){
					/////////Revisar como se llaman los campos de user y password
					String usuario = req.getParameter("user");
					String password = req.getParameter("password"); 
				
					if(gc.esAdmin(usuario,password)){
						
						//RequestDispatcher rd= req.getRequestDispatcher("/jsp/JSPFrontal.jsp");
						//rd.forward(req,res); 
						res.sendRedirect("/portalreservas/paneladmin/");
					}
					
					if(gc.validar(usuario,password)){
						
						
						
						
						
						////////////////////////////////////////////////////////////////////////
						ResultSet rs=null;
						st=con.createStatement();
						rs=st.executeQuery("SELECT * FROM usuario WHERE email='"+usuario+"'");
						rs.next();						
						usuarioconectado= new Usuario(rs.getString(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10));
						
						
						sesion.setAttribute("usuario_conectado", usuarioconectado);
						
						sesion.setAttribute("user", usuario);
						sesion.setAttribute("pass", password);
///////////////////////////////////////////////////////////////////////////////////////////////////////

						RequestDispatcher rd= req.getRequestDispatcher("/jsp/JSPFrontal.jsp");
						rd.forward(req,res); 
					
						
						
					}else{
						
						RequestDispatcher rd= req.getRequestDispatcher("/jsp/errorloginhome.jsp");
						rd.forward(req,res);
						
					}
					
					
					}else if(op==2){
						/////////Revisar como se llaman los campos de registro
						String nombre = req.getParameter("nombre");
						String apellidos = req.getParameter("apellidos");
						String dni = req.getParameter("dni");
						String email = req.getParameter("email");
						String direccion = req.getParameter("direccion");
						String codigo_postal = req.getParameter("codigo_postal");
						String password = req.getParameter("password1");
						String ciudad = req.getParameter("ciudad");
						int administrador = 0;
						
						if(gc.registrar(nombre,apellidos,dni,email,direccion,codigo_postal,password,ciudad,administrador)){
							
							/* RequestDispatcher rd= req.getRequestDispatcher("/Home.jsp");
							rd.forward(req,res); */
							
						}else{
							
							RequestDispatcher rd= req.getRequestDispatcher("/jsp/errorregistrohome.jsp");
							rd.forward(req,res);
							
						}
				
					
					
					}else{
						/////////Revisar como se llaman los campos de user y password
						String usuario = (String) sesion.getAttribute("user");
						String password2 = (String) sesion.getAttribute("pass"); 
						
					
						if(gc.esAdmin(usuario,password2)){
							//RequestDispatcher rd= req.getRequestDispatcher("/jsp/JSPFrontal.jsp");
							//rd.forward(req,res); 
							res.sendRedirect("/portalreservas/paneladmin/");
						}
						
						if(gc.validar(usuario,password2)){							
							////////////////////////////////////////////////////////////////////////
							ResultSet rs=null;
							st=con.createStatement();
							rs=st.executeQuery("SELECT * FROM usuario WHERE email='"+usuario+"'");
							rs.next();						
							usuarioconectado= new Usuario(rs.getString(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10));
							
	///////////////////////////////////////////////////////////////////////////////////////////////////////

							RequestDispatcher rd= req.getRequestDispatcher("/jsp/JSPFrontal.jsp");
							rd.forward(req,res); 
						
							
							
						}else{
							
							RequestDispatcher rd= req.getRequestDispatcher("/jsp/errorloginhome.jsp");
							rd.forward(req,res);
							
						}
						
					
					}
										
					
				
				
				
				
				
				
			
			
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	public void destroy(){
		
	}

	

}