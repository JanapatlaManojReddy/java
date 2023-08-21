import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoRegister {
	public static int RegisterDao(String fullName, String userName, String passWord, String phoneNumber, String emailId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Servlets";
		String u="root";
		String p="manoj123";
		String Query="INSERT INTO USERINFO VALUES(?,?,?,?,?)";
		Connection con =DriverManager.getConnection(url,u,p);
		PreparedStatement pre= con.prepareStatement(Query);
		pre.setString(1, fullName);
		pre.setString(2, userName);
		pre.setString(3, passWord);
		pre.setString(4, phoneNumber);
		pre.setString(5, emailId);
		 
		return pre.executeUpdate();
		

		
	}

}
