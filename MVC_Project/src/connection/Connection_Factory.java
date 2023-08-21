package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_Factory {
	public static Connection getConnection_factory()throws Exception{
		
		String url="jdbc:mysql://localhost:3306/project";
		String u="root";
		String p = "manoj123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,u,p);
		return con;
	}
}
