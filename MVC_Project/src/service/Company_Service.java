package service;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Company_Dto;

public interface Company_Service {
	public int Register_Company(Company_Dto d) throws ClassNotFoundException, SQLException,Exception; 
	 public int Update_Company(Company_Dto d,int Creg) throws ClassNotFoundException, SQLException,Exception;
	 public ResultSet Display_Company() throws ClassNotFoundException, SQLException,Exception; 
	 public int Delete_Company(int Creg) throws ClassNotFoundException, SQLException,Exception; 
	 public ResultSet Sort_Company(String column) throws ClassNotFoundException, SQLException,Exception;

}
