

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo3
 */
@WebServlet("/SessionDemo3")
public class SessionDemo3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        HttpSession session=request.getSession(false);
	        
	        String n=(String)session.getAttribute("email");
	        out.println("<h4>Session Id :"+session.getId());
	        out.print("<h3 align='right'>Hello "+n);  
	  
	        session.invalidate();
	        

	        out.print("<a href='sess.html'>session out</a>");
	        out.close();  
	    
	}

}
