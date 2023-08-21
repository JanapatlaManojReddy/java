package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Connectionss {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/database1";
		String user="root";
		String password="manoj123";
		String query="create table manoj1(roll int,name varchar(30))";
		//String query1="insert into manoj1 values(1,'manojreddy'),(2,'vinay'),(3,'nithin')";
		String query2="select * from manoj1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query2);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" ");
			System.out.println(rs.getString(2)+" ");
		}
		//st.executeUpdate(query1);
		st.executeQuery(query2);
		System.out.println("table created succefull");
		con.close();
		st.close();
		  
		

	}

}
