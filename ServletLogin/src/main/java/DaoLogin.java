import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoLogin {
	public static  ResultSet getDaoLogin() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Servlets";
		String u="root";
		String p="manoj123";
		String Query="SELECT uname,pword FROM UserInfo";
		Connection con =DriverManager.getConnection(url,u,p);
		PreparedStatement pre= con.prepareStatement(Query);
		ResultSet rs=pre.executeQuery();
		return rs;
		
		
	}

}
