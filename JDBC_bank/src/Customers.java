import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customers {
	private String name,address;
	private double saving,loanamount;
	
	Database locker=new Banklocker();
	public void openAccount(String name,String address,int saving) {
		this.name = name;
		this.address= address;
		this.saving = saving;
		try {
			Connection conn = DriverManager.getConnection(locker.geturl(),"root","$@Me3rkadam");
			Statement statement=conn.createStatement();
			statement.executeUpdate("insert into bank_accounts(name,amount,loanamount)"
				+ " value('"+name+"',"+saving+",0);");

			
			System.out.println("Account created successfully");
//			
		}catch(SQLException e) {
			System.out.println("An error occured while creating account");
		}
	}
	
	
	
}
