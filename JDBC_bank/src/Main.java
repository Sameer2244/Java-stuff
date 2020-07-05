import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) { 
	Customers cust= new Customers();
	Database database=new Banklocker();
	Banklocker locker2 = new Banklocker();
	Loans loan=new Loans();
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to open new Account?");
		System.out.println("To open account press 1 ");
		System.out.println("To view Database press 2");
		System.out.println("To take Loan press 3: ");
		System.out.println("To pay Loan EMI press 4: ");
		String getinput = input.nextLine();
		if(getinput.equals("1")) {
			String name,address;
			int saving;
			System.out.println("Enter you name: ");
			name=input.next();
			System.out.println("Enter you country: ");
			address= input.next();
			System.out.println("Enter deposit amount: ");
			saving= input.nextInt();
			database.handleCustomer(cust,name, address, saving);

		}else if(getinput.equals("2")){
			database.showDatabase();
			//System.out.println(locker.getNames());
		}else if(getinput.equals("3")){
			System.out.println("Enter your name: ");
			String name=input.next();
			System.out.println("Enter loan amount: ");
			int amount =input.nextInt();
			loan.getLoan(cust,name,amount);           //return full info about customer
			
			//System.out.println(locker.getNames()); //returns only name in the form of arraylist
		}else if(getinput.equals("4")){
			System.out.println("This option is not Available yet!");
		}else {
			System.out.println("Invalid option selected");
		}
		
		
	}
	
}








//try {
//	Connection conn = DriverManager.getConnection(database.geturl(),"root","$@Me3rkadam");
//	
//	Statement statement=conn.createStatement();
//	ResultSet resultset=statement.executeQuery("select * from bank_accounts");
////	result=statement.executeUpdate("insert into bank_accounts(id,name,accountnumber,amount,loanamount)"
////			+ " value(2,'sameer',1,100,0);");
//	while(resultset.next()) {
//
//		System.out.println(resultset.getString("loanamount"));
//	}
//}
// catch (SQLException e) {
//	// TODO Auto-generated catch block
//	System.out.println("An error occured");
//}