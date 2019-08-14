import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("/Ser5")
public class Ser5 extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter out=null;
		try
		{
			res.setContentType("text/html");
			
			out=res.getWriter();
			int no=Integer.parseInt(req.getParameter("txtsid"));
			String sna=req.getParameter("txtname");
			String cor=req.getParameter("txtcor");
	double fee=Double.parseDouble(req.getParameter("txtfee"));
			
	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","B200047","niit");
			String sql="insert into Student values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setString(2, sna);
			ps.setString(3, cor);
			ps.setDouble(4, fee);
			ps.execute();
			out.println("<b>Record Inserted Successfully....");
			con.close();
			out.close();
		}
		catch(Exception e)
		{
			out.print("Error :"+e);
		}
	}
}
