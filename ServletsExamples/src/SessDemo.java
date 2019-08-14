

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

@WebServlet("/SessDemo")
public class SessDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		HttpSession hs=request.getSession(true);

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		Date d=(Date)hs.getAttribute("date");

if(d!=null)
{
	out.print("<br><i> Last Date is  :"+d);
}
d=new Date();
hs.setAttribute("date",d);
out.println("<br> <b>The Current Date  is  :"+d);

out.close();
		
	}

}
