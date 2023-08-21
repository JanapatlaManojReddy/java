import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnectionn() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/onlineshoppingportal";
		String u="root";
		String p="manoj123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		return con;
	}

}
