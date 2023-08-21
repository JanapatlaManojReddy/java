package service;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Company_Dto;
import connection.DAO_FACTORY;
import DA0.Company_DAO;

public class Company_Service_Impl implements Company_Service{
    int rows;
    Company_DAO cdao;
    ResultSet rs;
	@Override
	public int Register_Company(Company_Dto d) throws ClassNotFoundException, SQLException, Exception {
	   cdao=DAO_FACTORY.getDAO_FACTORY();
	   rows=cdao.getRegister_Company(d);
		return rows;
	}

	@Override
	public int Update_Company(Company_Dto d, int Creg) throws ClassNotFoundException, SQLException, Exception {
		cdao=DAO_FACTORY.getDAO_FACTORY();
		rows=cdao.getUpdate_Company(d, Creg);
		return rows;
	}

	@Override
	public ResultSet Display_Company() throws ClassNotFoundException, SQLException, Exception {
		cdao=DAO_FACTORY.getDAO_FACTORY();
		rs=cdao.getDisplay_Company();
		return rs;
	}

	@Override
	public int Delete_Company(int Creg) throws ClassNotFoundException, SQLException, Exception {
		cdao=DAO_FACTORY.getDAO_FACTORY();
		rows=cdao.getDelete_Company(Creg);
		return rows;
	}

	@Override
	public ResultSet Sort_Company(String column) throws ClassNotFoundException, SQLException, Exception {
		cdao=DAO_FACTORY.getDAO_FACTORY();
		rs=cdao.getSort_Company(column);
		return rs;
	}

}
