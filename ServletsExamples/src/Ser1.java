//Servlet example with annotation
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Ser1")
public class Ser1 extends HttpServlet 
{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{

		
		res.setContentType("text/html");
		
		
		PrintWriter pw=res.getWriter();
		
		pw.print("<h2> Welcome to Learn Servlets </h2>");
		pw.print("<i> Have a niceday !");
		
		pw.close();
		
		
		
		
	}

}
