package connection;
import DA0.*;

public class DAO_FACTORY {
	static Company_DAO cdao= new Company_Dao_Impl();
	public static Company_DAO getDAO_FACTORY() {
		return cdao;
	}
	

}
