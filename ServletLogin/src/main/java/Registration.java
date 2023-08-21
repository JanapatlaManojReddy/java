import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Registration implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String fullName=req.getParameter("fullName");
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		String phoneNumber=req.getParameter("phoneNumber");
		String emailId=req.getParameter("emailId");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		try {
			int rows=DaoRegister.RegisterDao(fullName,userName,passWord,phoneNumber,emailId);
			if(rows>0) {
				out.println("<h1>registered succesfully</h1>");
				out.println("<a href=Login.html>login</a>");
			}
			else
			{
				out.println("not registered ");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
