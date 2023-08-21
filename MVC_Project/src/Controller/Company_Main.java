package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
import connection.Service_Factory;
import DTO.Company_Dto;
import service.Company_Service;
import connection.*;

public class Company_Main {
	static int CregNo;
	static String Cname;
	static String Clocation;
	static int CempNo;
	static String Cheadquarters;
	static int Cshare;
	static String Cceo;
	
	static ResultSet rs;
	static int rows,count;

	public static void main(String[] args)throws SQLException,Exception {
		
		/*String url="jdbc:mysql://localhost:3306/project";
		String u="root";
		String p = "manoj123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,u,p);
		PreparedStatement pst =con.prepareStatement("select * from Company");
		ResultSet rs;
		rs=pst.executeQuery();*/
		Company_Dto cdto= new Company_Dto();
		Company_Service cserv= Service_Factory.getService_Factory();
		Scanner sc = new Scanner(System.in);
		
		ResultSetMetaData rsmd;
		System.out.println("WELCOME TO MNC PORTEL");
		
		while(true) {
			System.out.println();
			System.out.print("1.Company Registration \t 2.Update Company Details \t 3.Display All Registered MNC's \n 4.Delete the company \t 5.Display in Sorted Form of MNC's \t 6.exit the portel");
			System.out.print("\n choose your option to continue \t:\t");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :  
					  System.out.println();
					  System.out.println("Enter Company Details");
					  System.out.print("company reg number \t:\t");
					  CregNo=sc.nextInt();
					  cdto.setCreg(CregNo);
					  rs=cserv.Display_Company();
					  
					  while(rs.next()) {
						  if(rs.getInt(1)==CregNo) {
							  
							  System.out.println("a company already registered with this reg number");
							  System.out.println("thank you for using company portal");
							  count++;
							  break;
						  }
					  }
					  if(count==0) {
					  System.out.print("company Name \t:\t");
					  Cname =sc.next();
					  System.out.print("company location \t:\t");
					  Clocation = sc.next();
					  System.out.print("no of employes in company \t:\t");
					  CempNo=sc.nextInt();
					  System.out.print("company headquarters \t:\t");
					  Cheadquarters = sc.next();
					  System.out.print("company share value \t:\t");
					  Cshare = sc.nextInt();
					  System.out.print("company Ceo \t:\t");
					  Cceo=sc.next();
					  System.out.println();
					  //cdto.setCreg(CregNo);
					  cdto.setCname(Cname);
					  cdto.setClocation(Clocation);
					  cdto.setCempNo(CempNo);
					  cdto.setCheadquarters(Cheadquarters);
					  cdto.setCshare(Cshare);
					  cdto.setCceo(Cceo);
					  rows=cserv.Register_Company(cdto);
					  if(rows>0){
						  System.out.println("COMPANY REGISTRATION SUCCESFULL");
					  }
					  else{
						  System.out.println("COMPANY REGISTRATION FAILS -- ENTER CORRECT DETAILS");
					  }
					  }
					  break;
			case 2:  System.out.println();
		             System.out.print("Enter the Company reg number to update\t:\t");    CregNo = sc.nextInt();
		             System.out.print("Enter location Name\t:\t");    Clocation = sc.next();
		             System.out.print("Enter Company Employee Number\t:\t");    CempNo = sc.nextInt();
		             System.out.print("Enter share values Number\t:\t");    Cshare = sc.nextInt();
		             System.out.print("Enter Company Ceo \t:\t");    Cceo = sc.next();
		             cdto.setClocation(Clocation);
		             cdto.setCempNo(CempNo);
		             cdto.setCshare(Cshare);
		             cdto.setCceo(Cceo);
		            rows= cserv.Update_Company(cdto, CregNo);
		             if(rows>0)
		            	 System.out.println("UPDATED SUCCESSFULLY");    
		             else
		            	 System.out.println("UPDATE FAILED");    
		             break;
					 
			case 3:
					System.out.println();
					System.out.print("ALL MNC's ");
					rs=cserv.Display_Company();
					rsmd=rs.getMetaData();
					System.out.print(rsmd.getTableName(1)+"TABLE INFORMATION");
					System.out.println(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t"+rsmd.getColumnName(3)+"\t"+rsmd.getColumnName(4)+"\t"+rsmd.getColumnName(5)+"\t"+rsmd.getColumnName(6)+"\t"+rsmd.getColumnName(7));
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getString(7));
					}
					break;
			case 4:
					System.out.println();
					System.out.println("ENTER THE COMPANY REGISTRATION NUMBER TO DELETE FROM THE PORTAL");
					CregNo=sc.nextInt();
					cdto.setCreg(CregNo);
					rs=cserv.Display_Company();
					while(rs.next()) {
						if(rs.getInt(1)==CregNo) {
							count++;
							
						}
					}
					if(count>0) {
					rows=cserv.Delete_Company(CregNo);
	
						System.out.println("COMPANY NAME SUCCESFULLY DELETED FROM THE PORTAL");
					}
					else {
						System.out.println("COMPANY REG NUMBER DOESN'T MATCH ");
					}
					break;
					
			case 5:
					System.out.println();
					System.out.print("ENTER THE COLUMN NAME YOU WANT TO SORT BY\t:\t");
					 String column =sc.next();    
					 rs = cserv.Sort_Company(column);
					    rsmd =rs.getMetaData();    
					    System.out.println();
					    System.out.println(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t"+rsmd.getColumnName(3)+"\t"+rsmd.getColumnName(4)+"\t"+rsmd.getColumnName(5)+"\t"+rsmd.getColumnName(6)+"\t"+rsmd.getColumnName(7));
					    
					    while(rs.next())
					    {    
					    	System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getString(7));
					    }
					    break;
		
			case 6: 
				System.out.println();
				System.out.println("THANKYOU FOR USING ELECTRICITY APPLICATION");    
				System.exit(6);
				break;   
			default:
				System.out.println();   
				System.out.println("INVALID OPTION");			    
		
			}
			
			
		}
	
		
		
		

	}

}
