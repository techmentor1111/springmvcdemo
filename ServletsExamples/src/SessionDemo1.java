

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/SessionDemo1")
public class SessionDemo1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userEmail");  

        out.print("Welcome "+n);  
          
        HttpSession sess=request.getSession();
        
        sess.setAttribute("email",n); 
  
        out.println("<h4>Session Id :"+sess.getId());
        
        out.print("<a href='SessionDemo2'>visit</a>");  
                  
        out.close();  

	}

}
