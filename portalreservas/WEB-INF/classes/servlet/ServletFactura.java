package servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.Exception;
import java.net.*;

import com.itextpdf.text.*;
import com.itextpdf.*;
import java.io.*;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
//import reservas.*;

public class ServletFactura extends HttpServlet{
	static int genera=1;
	private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
         
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);    
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	Connection con;
	Statement st;
	RequestDispatcher rd;
	PreparedStatement ps;
	ResultSet rs=null;
	//ArrayList<Facturas> factura;
	
	public void init(ServletConfig config){
		try{
		super.init(config);
		String cadena = config.getInitParameter("cadenaConex");
		String usuario = config.getInitParameter("user");
		String clave = config.getInitParameter("clave");
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(cadena,usuario,clave); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res){
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res){

		try{
		HttpSession misesion=req.getSession();
	
		st = con.createStatement();
		
		

		String query = "select * from facuras order by id desc limit 1;";
		rs = st.executeQuery(query);
		rs.next();
		misesion.setAttribute("facturas_id",rs.getInt("id"));
		misesion.setAttribute("facturas_idreserva",rs.getInt("id_reserva"));
		misesion.setAttribute("facturas_total",rs.getFloat("total"));
		misesion.setAttribute("facturas_fechapago",rs.getDate("fecha_pago"));
		misesion.setAttribute("facturas_formapago",rs.getString("Forma_pago"));
		misesion.setAttribute("facturas_contenido",rs.getString("contenido"));

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		
		
		if (genera!=1)
		{
		// We create the document and set the file name.        
		// Creamos el documento e indicamos el nombre del fichero.
			try {
			String pdfNewFile="d:/Profiles/iacena/Desktop/apache-tomcat-7.0.75/webapps/portalreservas/facturas/factura"+rs.getInt("id_reserva")+".pdf";
			Document document = new Document();
			try {
				PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));
			} catch (FileNotFoundException fileNotFoundException) {
				System.out.println("No such file was found to generate the PDF "
						+ "(No se encontró el fichero para generar el pdf)" + fileNotFoundException);
			}
			document.open();
			
					// First page
				// Primera página 
				Chunk chunk = new Chunk("FACTURA DE LA RESERVA", chapterFont);
				chunk.setBackground(BaseColor.GRAY);
				document.add(chunk);
				/*
				Let's create de first Chapter (Creemos el primer capítulo)
				/Chunk chunk1= new Chunk("FIdentificador: ");
				Chapter chapter = new Chapter(new Paragraph(chunk1), 1);
				chapter.setNumberDepth(0); 
				chapter.add(new Paragraph("Identificador: "+rs.getInt("id"), paragraphFont));
				
				 Chapter chapter2 = new Chapter(new Paragraph());
				chapter2.setNumberDepth(0); 
				chapter.add(new Paragraph("Identificador Reserva: "+rs.getInt("id_reserva"), paragraphFont));
				document.add(chapter2);
				Chapter chapter3 = new Chapter(new Paragraph(chunk), 1);
				chapter3.setNumberDepth(0);
				chapter3.add(new Paragraph("TOTAL: "+rs.getFloat("total"), paragraphFont));
				document.add(chapter3);
				Chapter chapter4 = new Chapter(new Paragraph(chunk), 1);
				chapter4.setNumberDepth(0);
				chapter4.add(new Paragraph("Fecha Pago: "+rs.getDate("fecha_pago"), paragraphFont));
				document.add(chapter4);
				Chapter chapter5 = new Chapter(new Paragraph(chunk), 1);
				chapter5.setNumberDepth(0);
				chapter5.add(new Paragraph("Forma Pago: "+rs.getString("Forma_pago"), paragraphFont));
				document.add(chapter5);
				Chapter chapter6 = new Chapter(new Paragraph(chunk), 1);
				chapter6.setNumberDepth(0);
				chapter6.add(new Paragraph("Descripcion: "+rs.getString("contenido"), paragraphFont));
				document.add(chapter6); */
				List listado = new List();
				ListItem id = new ListItem("Id:"+rs.getInt("id"));
				ListItem idReserva = new ListItem("Identificador de reserva:"+rs.getInt("id_reserva"));
				ListItem totalFactura = new ListItem("Total Factura:"+rs.getFloat("total"));
				ListItem fecha_p = new ListItem("Fecha de pago:"+rs.getDate("fecha_pago"));
				ListItem forma_p = new ListItem("Forma de Pago:"+rs.getString("Forma_pago"));
				ListItem desc = new ListItem("Descripcion:"+rs.getString("contenido"));
				listado.add(id);
				listado.add(idReserva);
				listado.add(totalFactura);
				listado.add(fecha_p);
				listado.add(forma_p);
				listado.add(desc);
				document.add(listado);
				
				
		 
			document.close();
			System.out.println("Your PDF file has been generated!(¡Se ha generado tu hoja PDF!");
		} catch (DocumentException documentException) {
			System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
		}
			
		}
		genera=100;
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/devolverFactura.jsp");//Mostrar la factura en el jsp
		rd.forward(req, res);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public void destroy(){
		
	}


}