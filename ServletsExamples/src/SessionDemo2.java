

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionDemo2")
public class SessionDemo2 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        HttpSession session=request.getSession(false);
        
        String n=(String)session.getAttribute("email");
        
        out.println("<h4>Session Id :"+session.getId());
        
        out.print("<h3 align='right'>Hello "+n);  
  
        out.print("<a href='SessionDemo3'>visit Again</a>");  
        
        
        out.close();  
  
        

	}

}
