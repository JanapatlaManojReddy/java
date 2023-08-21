package preparedStatement;
import java.sql.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		int id ;
		String name;
		String city;
		
		int age;
		String gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data ");
		id = sc.nextInt();
		name= sc.next();
		city=sc.next();
		
		age=sc.nextInt();
		gender = sc.next();
		Bean b = new Bean();
		b.setId(id);
		b.setName(name);
		b.setCity(city);
		
		b.setAge(age);
		b.setGender(gender);
		int rows=DAO.data(b);
		System.out.println("check the data base for updated values");
	}
	
	
}

	/*public static void main(String[] args) throws Exception {
     ResultSet rs = DAO.data();
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
