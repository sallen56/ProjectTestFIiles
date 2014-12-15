package person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Customer extends Users {

   
	public Customer(String sFirstName, String sLastName, String sAddress,
			String sCity, String sState, String sZip, String sUserName,
			String sPassword, String sEmail, String lSSN,
			String sSecurity_Question) {
		super(sFirstName, sLastName, sAddress, sCity, sState, sZip, sUserName,
				sPassword, sEmail, lSSN, sSecurity_Question);
		
	}
	public void newCustomer(String sFirstName, String sLastName, String sAddress,
			String sCity, String sState, String sZip, String sUserName,
			String sPassword, String sEmail, String lSSN,
			String sSecurity_Question){
	try {

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/myproject", "root", "Career2014");
		Statement myState = con.createStatement();
	   myState.executeUpdate("INSERT INTO user (firstName, lastName, address,city,state,zip,userName,password,email,ssn,S_Question)"+
		"VALUES ('"+sFirstName+"','"+sLastName+"','"+sAddress+"','"+sCity+"','"+sState+"','"+sZip+"','"+sUserName+"','"+sPassword+"','"+sEmail+"','"+lSSN+"','"+sSecurity_Question+"') ;");
		/*while (result.next()) {
			System.out.println("Name: " + result.getString("firstName"));
		}*/
	} catch (Exception ex) {			
		ex.printStackTrace();
	}//end of catch
}
	@Override
	public String toString() {
		return super.toString();
	}

	





}
