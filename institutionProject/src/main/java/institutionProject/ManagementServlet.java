package institutionProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ManagerServlet")
public class ManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
         
	try {
		ResultSet rs=ManagerLoginDao.getManagerLogin(username);
		ResultSet rss;
		if(rs.next()) {
			if(password.equals(rs.getString(2))){
				out.println("login successful");
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/project";
				String u="root";
				String p="manoj123";
				String query="select*from student";
				Connection con = DriverManager.getConnection(url,u,p);
				PreparedStatement pre= con.prepareStatement(query);
				rss=pre.executeQuery();
				out.println("<table align='center' cellspacing='5px' cellpadding='5px'>"
						+"<tr>"
						+"<th>StudentName</th>"
						+"<th>CollegeName</th>"
						+"<th>passoutYear</th>"
						+"<th>Qualification</th>"
						+"<th>courses</th>"
						+"<th>Studentid</th>"+"</tr>");
				while(rss.next()) {
					out.println("<tr>");
					out.println("<td>"+rss.getString(1)+"</td>");
					out.println("<td>"+rss.getString(2)+"</td>");
					out.println("<td>"+rss.getInt(3)+"</td>");
					out.println("<td>"+rss.getString(4)+"</td>");
					out.println("<td>"+rss.getString(5)+"</td>");
					out.println("<td>"+rss.getInt(6)+"</td>");
					out.println("<td> <a href='editservlet? studentId="+rss.getInt(6)+"'>Edit</a></td>");
					out.println("<td> <a href='deleteservlet? studentId="+rss.getInt(6)+"'>Delete</a></td>");
					out.println("</tr>");
				}
				out.println("</table>");
					
				}
						
						
						
						
						
				
			}
		
		
		
	} 
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
