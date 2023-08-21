package institutionProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerLoginDao {
	public static ResultSet getManagerLogin(String username) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/project";
		String u="root";
		String p="manoj123";
		String query="select*from managerLogin where username=?";
		Connection con = DriverManager.getConnection(url,u,p);
		PreparedStatement pre= con.prepareStatement(query);
		
		pre.setString(1, username);
		ResultSet rs= pre.executeQuery();
		return rs; 
	}

}
