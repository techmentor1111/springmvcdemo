//To create cookies or  add cookies

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/CookieDemo1")
public class CookieDemo1 extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{


		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");
	    String m=request.getParameter("userEmail");
	    
	    out.print("Welcome "+n);  
	  
	    Cookie ck=new Cookie("uname",n);//creating cookie object
	    Cookie ck1=new Cookie("email",m);//creating cookie object
	    
	    response.addCookie(ck);//adding cookie in the response
	    response.addCookie(ck1);//adding cookie in the response
	    
	  ck.setMaxAge(100);
	  
	    //creating submit button  
	    out.print("<form action='CookieDemo2'>");  
	    out.print("<input type='submit' value='continue'>");  
	    out.print("</form>");  
	          
	    out.close();  
	  
	    
	}

}
