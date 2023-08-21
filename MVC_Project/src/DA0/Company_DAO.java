package DA0;
import java.sql.*;
import DTO.*;

public interface Company_DAO {
	 public int getRegister_Company(Company_Dto d) throws ClassNotFoundException, SQLException,Exception; 
	 public int getUpdate_Company(Company_Dto d,int Creg) throws ClassNotFoundException, SQLException,Exception;
	 public ResultSet getDisplay_Company() throws ClassNotFoundException, SQLException,Exception; 
	 public int getDelete_Company(int Creg) throws ClassNotFoundException, SQLException,Exception; 
	 public ResultSet getSort_Company(String column) throws ClassNotFoundException, SQLException,Exception;

}
