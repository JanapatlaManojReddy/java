package preparedStatement;
import java.sql.*;
import java.sql.PreparedStatement;



public class DAO {
	public static int data(Bean b)throws Exception{
		java.sql.Date sqlDate1 = new java.sql.Date(new java.util.Date().getTime());
		String query ="insert into customer values(?,?,?,?,?,?)";
		Connection con = ConnectionFactory.getData();
		PreparedStatement pt = con.prepareStatement(query);
		pt.setInt(1,b.getId());
		pt.setString(2,b.getName());
		pt.setString(3,b.getCity());
		pt.setDate(4, sqlDate1);
		pt.setInt(5,b.getAge());
		pt.setString(6, b.getGender());
		
		
		int rs = pt.executeUpdate(); //non select query
		return rs;
	}

}
