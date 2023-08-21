package preparedStatement;
import java.sql.*;

import java.sql.Date;

public class Bean {
	
		int id ;
		String name;
		String city;
		
		int age;
		String gender;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public void setDate(Date sqlDate1) {
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
/*	public static void main(String[] args)throws Exception {
		
		
		String url = "jdbc:mysql://localhost:3306/database1";
		String u="root";
		String p = "manoj123";
		//you have to convert from java.util.Date to java.sql.Date .
		java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
		String query="insert into customer values(?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,u,p);
		PreparedStatement pt = con.prepareStatement(query);
		pt.setInt(1, 11);
		pt.setString(2, "vinu");
		pt.setString(3, "vijayawaada");
		pt.setDate(4, sqlDate);
		pt.setInt(5,33);
		pt.setString(6,"female");
		int x = pt.executeUpdate();
		System.out.println(x);
		
	}
	
}*/ 
	
	
	
	
	
	
	/*public static void main(String[] args)throws Exception {
		String url = "jdbc:mysql://localhost:3306/database1";
		String u="root";
		String p = "manoj123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,u,p);
		String query = "select*from customer";
	    PreparedStatement pt= con.prepareStatement(query);
	    ResultSet rs = pt.executeQuery();
	    while(rs.next()) {
	    	System.out.print(rs.getInt(1)+" ");
	    	System.out.print(rs.getString(2)+" ");
	    	System.out.print(rs.getString(3)+" ");
	    	System.out.print(rs.getDate(4)+" ");
	    	System.out.print(rs.getInt(5)+" ");
	    	System.out.print(rs.getString(6)+" ");
	    	System.out.println();
	    }
		
		
		
	}
	
	
}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String url = "jdbc:mysql://localhost:3306/database1";
		String u="root";
		String p = "manoj123";
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url,u,p);
	    String query= "select * from customer";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    while(rs.next()) {
	    	System.out.print(rs.getInt(1)+" ");
	    	System.out.print(rs.getString(2)+" ");
	    	System.out.print(rs.getString(3)+" ");
	    	System.out.print(rs.getDate(4)+" ");
	    	System.out.print(rs.getInt(5)+" ");
	    	System.out.print(rs.getString(6)+" ");
	    	System.out.println();
	    }
	}

}*/
