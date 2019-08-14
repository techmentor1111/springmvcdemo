

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Ser3")
public class Ser3 extends HttpServlet 
{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{

		res.setContentType("text/html");
		
		String col=req.getParameter("txtcol");
		
		PrintWriter out=res.getWriter();
		
		
		out.print("<body bgcolor='"+col+"'>");
		out.print("<i> Selected color  is  : "+col);
		
		out.close();
	}

}
