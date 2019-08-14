//Read Cookies

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieDemo2")
public class CookieDemo2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    Cookie ck[]=request.getCookies();  
	    
	    /*(out.print("Name  : "+ck[0].getName());  
	    out.print(" Value  "+ck[0].getValue());  
		
	    out.print("Name  : "+ck[1].getName());  
	    out.print(" Value  "+ck[1].getValue());  
		
	    out.print("<br> Max age  is :"+ck[0].getMaxAge());
	    */
	    
	    for(int i=0;i<ck.length;i++)
	    {
	    	out.print("<br>Name  : "+ck[i].getName()+"   Value  :"+ck[i].getValue());
	    }
	    out.close();  

	}

}
