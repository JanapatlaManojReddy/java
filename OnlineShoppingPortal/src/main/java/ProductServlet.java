

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out= response.getWriter();
		Connection con;
		try {
			con = ConnectionFactory.getConnectionn();
		
		String query="Select * from products";
		PreparedStatement pre=  con.prepareStatement(query);
		ResultSet rs=pre.executeQuery();
		out.println("<h1>PRODUCT DETAILS</h1>");
		out.println("<table align=\"center\" cellpadding=\"5px\" cellspacing=\"5px\" border=\"1px\"");
		while(rs.next()) {
		out.println("<tr>");
		out.print("<td>"+rs.getString(1)+"</td>");
		out.print("<td>"+rs.getString(2)+"</td>");
		out.print("<td>"+rs.getInt(3)+"</td>");
		out.print("<td>"+rs.getInt(4)+"</td>");
		
		out.println("</tr>");
		}
		out.println("</table>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
