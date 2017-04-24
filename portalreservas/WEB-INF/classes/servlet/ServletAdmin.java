package servlet;
import utilidades.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;

public class ServletAdmin extends HttpServlet{
	

	Connection con;
	Statement st;
	PreparedStatement ps;
	GestionClientes gc;
	
	
	
	public void init(ServletConfig config){
		try{
		super.init(config);
		String cadena = config.getInitParameter("cadenaConex");
		String driver = config.getInitParameter("driver");
	
		gc = new GestionClientes(driver,cadena);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
								
			
			
		try{
			
					/* String nombre = req.getParameter("nombre");
					String apellidos = req.getParameter("apellidos");
					String dni = req.getParameter("dni");
					String email = req.getParameter("email");
					String direccion = req.getParameter("direccion");
					String codigo_postal = req.getParameter("codigo_postal");
					String password = req.getParameter("password1");
					String ciudad = req.getParameter("ciudad");
					int administrador = 1;
			 */
			RequestDispatcher rd= req.getRequestDispatcher("/jsp/JSPAdmin.jsp");
			rd.forward(req,res);
			if(req.getParameter("logout")=="Log out"){
				HttpSession sesion=req.getSession();
				sesion.setAttribute("usuario_conectado", "");
				sesion.setAttribute("user", "");
				res.sendRedirect("/portalreservas/miwebfrontal/");
				
			}
			
			//if(gc.registrar(nombre,apellidos,dni,email,direccion,codigo_postal,password,ciudad,administrador)){
						
						/* RequestDispatcher rd= req.getRequestDispatcher("/Home.jsp");
						rd.forward(req,res); */
						
					/* }else{
						
						RequestDispatcher rd= req.getRequestDispatcher("/jsp/errorregistrohome.jsp");
						rd.forward(req,res);
						
					}
			
			
			
			
						
				/* int op = Integer.parseInt(req.getParameter("opcion"));
				if(op==1){
					/////////Revisar como se llaman los campos de user y password
					String usuario = req.getParameter("user");
					String password = req.getParameter("password"); 

					
					if(gc.validar(usuario,password)){
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
						
					/* }else{
						
						RequestDispatcher rd= req.getRequestDispatcher("/jsp/errorregistrohome.jsp");
						rd.forward(req,res);
						
					}
				
					
					
				}
										
					
				RequestDispatcher rd= req.getRequestDispatcher("/jsp/JSPFrontal.jsp");
				rd.forward(req,res); */
				
				
				
				 
				
			
			
		
		}catch(Exception e){
			/* //Si hay OTRA excepcion se va a la pagina de error
			RequestDispatcher rd= req.getRequestDispatcher("/jsp/error otra cosa.jsp");
			rd.forward(req,res); */
		}
		
	}
	
	
	
	public void destroy(){
		
	}

	

}