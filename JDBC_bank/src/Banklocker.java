import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class Banklocker extends Database implements Employee {

	@Override
	public String geturl() {
		// TODO Auto-generated method stub
		return super.url();
	}

	@Override
	public void showDatabase() {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection(this.geturl(),"root","$@Me3rkadam");
			Statement statement=conn.createStatement();
			ResultSet resultset=statement.executeQuery("select * from bank_accounts");
		
			while(resultset.next()) {
				System.out.println("name: "+resultset.getString("name"));
				System.out.println("loanamount : "+resultset.getString("loanamount"));
				System.out.println("savings : "+resultset.getString("amount"));
				System.out.println(" ");
			}
			}catch(SQLException e) {
				System.out.println("An error occured while Accessing database");
			}
	}
	
	public ArrayList<String> getNames(){
		ArrayList<String> returnarray= new ArrayList<String>();
		try {
			Connection conn = DriverManager.getConnection(this.geturl(),"root","$@Me3rkadam");
			Statement statement=conn.createStatement();
			ResultSet resultset=statement.executeQuery("select * from bank_accounts");
			while(resultset.next()) {
				returnarray.add(resultset.getString("name"));
			}
		}catch(SQLException e) {
			System.out.println("An error occured while Accessing database");
		}
		return returnarray;
	}

	public void handleCustomer(Customers cust,String name,String address,int saving) {
		// TODO Auto-generated method stub
		cust.openAccount(name,address,saving);
	}

	
	public void getLoan(Customers cust,String name ,int amount) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Integer> loans(){
		
		ArrayList<Integer> returnloan= new ArrayList<Integer>();
		try {
		Connection conn = DriverManager.getConnection(this.geturl(),"root","$@Me3rkadam");
		Statement statement=conn.createStatement();
		ResultSet resultset=statement.executeQuery("select * from bank_accounts");
		while(resultset.next()) {
			returnloan.add(resultset.getInt("loanamount"));
			}
		}catch(SQLException e) {
				System.out.println("An error occured while Accessing database");
		}
		return returnloan;
	}
	public HashMap<String,Integer> getLoaninfo(ArrayList<String> names,ArrayList<Integer> amount) {
		HashMap<String,Integer> returningHM = new HashMap<String,Integer>();
		for(int i =0;i<names.size();i++) {
			returningHM.put(names.get(i), amount.get(i));
		}
	return returningHM;	
	}

}
