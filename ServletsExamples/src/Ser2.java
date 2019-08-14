

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class Ser2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
res.setContentType("text/html");
		
		
		PrintWriter pw=res.getWriter();
		
		pw.print("<h2> Welcome to Learn Servlets Without Annotation using web.xml </h2>");
		pw.print("<i> Have a niceday !");
		
		pw.close();
		
		
	}

}
