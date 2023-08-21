

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName=request.getParameter("fullName");
		String userName=request.getParameter("userName");
		String passWord=request.getParameter("passWord");
		String phoneNumber=request.getParameter("phoneNumber");
		String emailId=request.getParameter("emailId");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			int row=DaoUserRegister.getUserRegister(fullName,userName,passWord,phoneNumber,emailId);
			if(row>0) {
				out.println("register successfull");
				response.sendRedirect("UserLogin.jsp");
				
			}
			else
			{
				out.println("try again");
				RequestDispatcher rs=request.getRequestDispatcher("UserRegister.jsp");
				rs.include(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
