import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoUserRegister  {
	



	public static int getUserRegister(String fullName, String userName, String passWord, String phoneNumber,
			String emailId) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/onlineshoppingportal";
		String u="root";
		String p="manoj123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,u,p);
		String query="INSERT INTO USERREGISTER VALUES(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,fullName);
		ps.setString(2,userName);
		ps.setString(3,passWord);
		ps.setString(4,phoneNumber);
		ps.setString(5,emailId);
		int row=ps.executeUpdate();
		return row;
		
	}

}
