package connection;

import service.Company_Service;
import service.Company_Service_Impl;

public class Service_Factory {
	static Company_Service cserv= new Company_Service_Impl();
	public static Company_Service getService_Factory() {
		
		return cserv;
		
	}

}
