
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Ser")
public class Ser4 extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		int sno=Integer.parseInt(req.getParameter("txtsid"));
		String sna=req.getParameter("txtname");
		String cor=req.getParameter("txtcor");
		double fee=Double.parseDouble(req.getParameter("txtfee"));
		
	out.print("<h1>  Student  Id :"+sno+"<br>Student Name  :"+sna+"<br> Course  :"+cor+"<br> Fees :"+fee);

		out.close();
	}

}
