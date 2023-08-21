import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoUserLogin {
	public static ResultSet getDaoUserLogin(String userName) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionFactory.getConnectionn();
		String query="Select userName,passWord from UserRegister where userName=?";
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1,userName);
		ResultSet rs=pst.executeQuery();
		return rs;
	}
   
}
