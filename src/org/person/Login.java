package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	private Connection con;
	private Statement myState;
	private ResultSet result;
	
	public void login(String name, String pw) {

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/myproject", "root", "Career2014");
			myState = con.createStatement();
			result = myState.executeQuery(" SELECT userName FROM user WHERE userName ='"+ name + "' AND password='" + pw + "';");
		while (result.next()) {
				
					System.out.println("Name: " + result.getString("userName"));
					System.out.println("You are Login");
				
				}//end of while
			

			
		} catch (Exception ex) {
			ex.printStackTrace();
		}// end of try catch
		
	}
}// end of class
