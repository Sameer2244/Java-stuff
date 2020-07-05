import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Loans implements Employee {

	Database locker = new Banklocker();
	Banklocker locker2 = new Banklocker();
	public static int result;
	public static String loanamount;
	@Override
	public void handleCustomer(Customers cust, String name, String address, int saving) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getLoan(Customers cust,String name,int amount) {
		// TODO Auto-generated method stub
		try {
			HashMap<String,Integer> Loaninfo=locker2.getLoaninfo(locker2.getNames(),locker2.loans());
			int loanamount =Loaninfo.get(name);
			Connection conn = DriverManager.getConnection(locker.geturl(),"root","$@Me3rkadam");
			Statement statement=conn.createStatement();
			loanamount+=amount;
			result =statement.executeUpdate("UPDATE bank_accounts SET loanamount ="+loanamount+" where name='"+name+"';");

			if(result>0)
				System.out.println("You have successfully Taken Loan");
			else System.out.println("Account not found");
//			
		}catch(SQLException e) {
			System.out.println("An error occured while getting loan amount");
		}
	}

	

}
