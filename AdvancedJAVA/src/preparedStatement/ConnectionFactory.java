package preparedStatement;
import java.sql.*;

public class ConnectionFactory {
	public static Connection getData()throws Exception{
	
	String url="jdbc:mysql://localhost:3306/database1";
	String u="root";
	String p = "manoj123";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,u,p);
	return con;

}
}