package servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.Exception;
import java.net.*;
import reservas.*;
import java.util.ArrayList;


public class ServletReserva extends HttpServlet{

	Connection con;
	Statement st;
	RequestDispatcher rd;
	PreparedStatement ps,ps1;
	ResultSet rsH, rsH2;
	ResultSet rs;
	ArrayList<Hotel> hoteles;
	ArrayList<Habitacion> arrayhab= new ArrayList<Habitacion>();
	int flag=0;
	Habitacion hab_aux;
	float senal ;
	String forma_pago;
	String nombreH;
	public void init(ServletConfig config){
		try{
		super.init(config);
		String cadena = config.getInitParameter("cadenaConex");
		String usuario = config.getInitParameter("user");
		String clave = config.getInitParameter("clave");
		Class.forName("com.mysql.jdbc.Driver");
		//hoteles=new ArrayList<Hotel>();
		con = DriverManager.getConnection(cadena,usuario,clave); 
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		try{
			HttpSession misesion=req.getSession();
			Usuario usu = new Usuario();
			hoteles=new ArrayList<Hotel>();
			st=con.createStatement();
			String query= "select * from hotel order by id";
			rs=null;
			rs=st.executeQuery(query);
			
			
			usu = (Usuario) misesion.getAttribute("usuario_conectado");
			System.out.println("usu.getId() : "+usu.getId());
			flag= Integer.parseInt(req.getParameter("flag"));
			
			if(flag==1){
				while(rs.next()){
		
				Hotel ht=new Hotel(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
				hoteles.add(ht);
				System.out.println(rs.getString(2));
		
				}				
				misesion.setAttribute("array_hoteles", hoteles);
				
				RequestDispatcher requestDispatcher; 
				requestDispatcher = req.getRequestDispatcher("/jsp/formReservas.jsp");
				requestDispatcher.forward(req, res);
			}
		
		

		
			if(flag==2){

				//Recogemos parametros del formulario		
				
				nombreH = req.getParameter("hotel");//nombre del hotel
				Date fechae = Date.valueOf(req.getParameter("fecha_e"));//fecha de entrada
				Date fechas = Date.valueOf(req.getParameter("fecha_s"));//fecha de salida
				String hab = req.getParameter("habitaciones");//habitacion individual, doble, tripe, cuadruple

				int personas = 0;
				
				//EXTRAS
				String nombreP = req.getParameter("pension");//nombre del producto(MP, PC)
				String nombrePr = req.getParameter("garaje");//nombre del producto(extra)
				
				int pers_menores=0;
				pers_menores = Integer.parseInt(req.getParameter("ninios"));//numero de personas menores de 8 años
				personas=Integer.parseInt(hab)-pers_menores;
				forma_pago = req.getParameter("pago");//forma de pago
				
				
				senal = 0;
				//si paga por tarjeta o transfer no hay señal, si paga en metalico:
				if(forma_pago=="Metalico") senal = 1;//señal es bool
				
				//int idusuario = Integer.parseInt(req.getParameter("id"));//usuario
				String vista = req.getParameter("vistas");//1:mar, 0:interior
				String vista_cad="";
				if(vista.equals("1"))vista_cad="Mar";
				if(vista.equals("0"))vista_cad="Interior";
						
				misesion.setAttribute("nombre", nombreH);//nombre hotel en la bd
				misesion.setAttribute("fecha_e", fechae);
				misesion.setAttribute("fecha_s", fechas);
				misesion.setAttribute("habitaciones", personas);
				misesion.setAttribute("pension", nombreP);//MP, PC...
				misesion.setAttribute("garaje", nombrePr);//garaje
				misesion.setAttribute("senal", senal);
				misesion.setAttribute("ninios", pers_menores);
				//misesion.setAttribute("id", idusuario);
				misesion.setAttribute("con_vistas", vista_cad);//1:mar, 0:interior
				
				System.out.println(""+nombreH+vista+personas);
				
				st = con.createStatement();
				String queryHab= "select a.id from habitacion a, hotel h where h.nombre = '"+nombreH+"' AND h.id=a.id_hotel AND a.disponible = 1 AND con_vistas="+vista+" AND persona="+personas;
				rsH = st.executeQuery(queryHab);
					ArrayList<Integer> vector= new ArrayList<Integer>();
						
				while(rsH.next()){
					vector.add(new Integer(rsH.getInt(1)));	
					System.out.println("Entro while");
				}
			
			
			
				System.out.println("PASO");
				
				
				for(int j=0;j<vector.size();j++){
				System.out.println(""+vector.get(j));
				String queryHab_1= "select * from habitacion where id="+vector.get(j) + " and disponible = 1" ;
				System.out.println(queryHab_1);
				rsH2=st.executeQuery(queryHab_1);
				rsH2.next();
				 
				hab_aux=new Habitacion(rsH2.getInt(1), rsH2.getInt(2),rsH2.getInt(3),rsH2.getInt(4),rsH2.getInt(5),rsH2.getFloat(6), rsH2.getInt(7), rsH2.getInt(8), rsH2.getInt(9));
				arrayhab.add(hab_aux); 
				}
				
				
				misesion.setAttribute("array_habitaciones", arrayhab);
				RequestDispatcher requestDispatcher; 
				requestDispatcher = req.getRequestDispatcher("/jsp/formReservas_2.jsp");
				requestDispatcher.forward(req, res); 

			}
			
			if(flag==3){
				
				String id_hab=req.getParameter("hab_seleccion");
				String queryHab= "UPDATE habitacion h SET h.disponible=0 WHERE h.id="+id_hab;
				st.executeUpdate(queryHab);
				
				for(int k=0;k<arrayhab.size();k++){
					if(arrayhab.get(k).getId()==Integer.parseInt(id_hab))
						hab_aux=arrayhab.get(k);
				}
					
				
				//para sacar la señal(precio*0.2)
				String queryIN;
				queryIN = "INSERT INTO reservas(id_usuario, id_habitacion, fecha_e, fecha_s, entradaSen, personas_menores) VALUES (";
				queryIN += usu.getId()+ "," +id_hab+ ",\"" +req.getParameter("fecha_e")+ "\",\"" +req.getParameter("fecha_s")+ "\"," +senal+ "," +Integer.parseInt((String)req.getParameter("ninios")) +")";
				
				
				System.out.println("queryIN : "+queryIN);
				//ps.setInt(1, Integer.parseInt((String)misesion.getAttribute("id")));//id_usuario
				
				st.execute(queryIN);
				System.out.println("pasaaaaa");
				rd=req.getRequestDispatcher("/jsp/confirmacionreserva.jsp");
				rd.forward(req, res);
				
			}
			
			if(flag==4){
				int id_reserva=0;
				String desc= "Nombre Hotel: " + nombreH + "\n" +"Precio: " + hab_aux.getPrecio();
				rs=st.executeQuery("select id from reservas where id_usuario=" +usu.getId()+ " and id_habitacion=" +req.getParameter("hab_seleccion"));
				while(rs.next()){
					id_reserva=rs.getInt(1);
			
					}
				String queryFact;
				queryFact = "INSERT INTO facuras(id_reserva,total,fecha_pago,Forma_pago,contenido) VALUES (";
				queryFact += id_reserva+ "," +req.getParameter("hab_seleccion")+ ",\"" +req.getParameter("fecha_e")+ "\",\"" +req.getParameter("pago")+ "\",\"" +desc+ "\")";
System.out.println("queryFact : "+queryFact);
				
				st.execute(queryFact);
				rd=req.getRequestDispatcher("/jsp/reservacorrecta.jsp");
				rd.forward(req, res);
			
			
			}
			
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void destroy(){
		
	}


}