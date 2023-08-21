

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String passWord=request.getParameter("passWord");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			ResultSet rs = DaoUserLogin.getDaoUserLogin(userName);
         if(rs.next()) {
				
				
				if(userName.equalsIgnoreCase(rs.getString(1))&&passWord.equals(rs.getString(2))) {
					
					response.sendRedirect("Product");
					
				}
				else {
					RequestDispatcher req= request.getRequestDispatcher("UserLogin.jsp");
					req.include(request, response);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
