package DA0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Company_Dto;

import connection.Connection_Factory;

public class Company_Dao_Impl implements Company_DAO{

	@Override
	public int getRegister_Company(Company_Dto d) throws ClassNotFoundException, SQLException, Exception {
		String query ="insert into company_portal(Creg,Cname,Clocation,CempNo,Cheadquarters,Cshare,Cceo) values(?,?,?,?,?,?,? )";
		Connection con = Connection_Factory.getConnection_factory();
		PreparedStatement pt = con.prepareStatement(query);
		pt.setInt(1,d.getCreg());
		pt.setString(2,d.getCname());
		pt.setString(3,d.getClocation());
		pt.setInt(4, d.getCempNo());
		pt.setString(5,d.getCheadquarters());
		pt.setInt(6,d.getCshare());
		pt.setString(7, d.getCceo());
		
		
		int rows = pt.executeUpdate(); //non select query
		return rows;
		
	}

	@Override
	public int getUpdate_Company(Company_Dto d, int Creg) throws ClassNotFoundException, SQLException, Exception {
		String query ="update  company_portal set Clocation=?,CempNo=?,Cshare=?,Cceo=? where Creg="+Creg;
		Connection con = Connection_Factory.getConnection_factory();
		PreparedStatement pt = con.prepareStatement(query);
		
		pt.setString(1,d.getClocation());
		pt.setInt(2, d.getCempNo());
		pt.setInt(3,d.getCshare());
		pt.setString(4, d.getCceo());
		
		
		int rows = pt.executeUpdate(); //non select query
		return rows;
		
	}

	@Override
	public ResultSet getDisplay_Company() throws ClassNotFoundException, SQLException,Exception {
		String query="select*from company_portal";
		Connection con = Connection_Factory.getConnection_factory();
		PreparedStatement pst = con.prepareStatement(query);
		ResultSet rs = pst.executeQuery();
	
		return rs;
	}

	@Override
	public int getDelete_Company(int Creg) throws ClassNotFoundException, SQLException,Exception {
		Connection con = Connection_Factory.getConnection_factory();
		String query="delect from company_portal where Creg="+Creg;
		PreparedStatement pst = con.prepareStatement(query);
		int rows = pst.executeUpdate();
		return rows;
	}

	@Override
	public ResultSet getSort_Company(String column) throws ClassNotFoundException, SQLException ,Exception{
		Connection con = Connection_Factory.getConnection_factory();
		String query = "select * from company_portal order by "+column;
		PreparedStatement pst =con. prepareStatement(query);
		ResultSet rs = pst.executeQuery();
		
		return rs;
	}
	
}


