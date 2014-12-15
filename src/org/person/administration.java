package person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class administration extends Users  {
	private int idAdmin;
		
	public administration(int adminId, String sFirstName, String sLastName, String sAddress,String sCity, String sState,String sZip, String sUserName,String sPassword, String sEmail, String lSSN,String sSecurity_Question) {
		super(sFirstName, sLastName, sAddress, sCity,  sState, sZip,sUserName,sPassword, sEmail, lSSN, sSecurity_Question);
			idAdmin = adminId;	
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public void newAdmin(int adminId, String sFirstName, String sLastName, String sAddress,String sCity, String sState,String sZip, String sUserName,String sPassword, String sEmail, String lSSN,String sSecurity_Question){
	try {

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/myproject", "root", "Career2014");
		Statement myState = con.createStatement();
	   myState.executeUpdate("INSERT INTO user (firstName, lastName, address,city,state,zip,userName,password,email,ssn,S_Question)"+
		"VALUES ('Simmigon','Flagg','766 Plainville Dr SW','Atlanta','Ga','33333','Sim','12345a','simmigon@gmail.com','555555555','What City where you born in?') ;");
		/*while (result.next()) {
			System.out.println("Name: " + result.getString("firstName"));
		}*/
	} catch (Exception ex) {			
		ex.printStackTrace();
	}//end of catch
	}

	@Override
	public String toString() {
		return "Administration Id = "+ idAdmin +"\n" + super.toString() ;
	}
}
