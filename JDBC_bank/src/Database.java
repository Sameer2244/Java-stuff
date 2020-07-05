import java.util.ArrayList;
import java.util.HashMap;

abstract class Database {
	
	private String databaseurl="jdbc:mysql://localhost:3306/bank_database";
	
	public String url() {
		return this.databaseurl;
	}
	
	public abstract String geturl();
	
	public abstract void showDatabase();
	
	public abstract void handleCustomer(Customers cust,String name,String address,int saving);


}
