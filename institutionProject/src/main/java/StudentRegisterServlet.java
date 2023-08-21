

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import institutionProject.StudentRegistrationDao;


@WebServlet("/StudentServlet")
public class StudentRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentName=request.getParameter("studentName");
		String collegeName=request.getParameter("collegeName");
		
		int passoutYear=Integer.parseInt(request.getParameter("passoutYear"));
		String qualification=request.getParameter("qualification");
		String courses=request.getParameter("courses");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			int rows=StudentRegistrationDao.getData(studentName,collegeName,passoutYear,qualification,courses);
			if(rows>0) {
				out.println("succesfully registered");
				
			}
			else {
				out.println("try again");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}




	}

}
