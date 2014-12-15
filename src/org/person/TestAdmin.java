package person;

import java.util.Scanner;

public class TestAdmin  {
	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
			 
		int  adminId = 0 ;
		String fname = null;
		String lname = null;
		String address = null;
		String city = null;		
		String state = null;
		String zip = null;
		String UserName = null;
		String password = null;
		String Email = null;
		String ssn = null;
		String S_Question = null;
		administration admin1 = new  administration(adminId,
				fname, lname, address,city,state,zip, 
				UserName, password, Email,ssn,S_Question);
		System.out.print("Admin Id");
		adminId = sc.nextInt();
		admin1.setIdAdmin(adminId);
		
		System.out.println("Name:");
		fname =  sc.next();
		admin1.setsFirstName(fname);
		lname = sc.nextLine();
		admin1.setsLastName(lname);
		
		System.out.println("Address:");
		address = sc.nextLine();
		admin1.setsAddress(address);
		
		
		System.out.println("City:");
		city = sc.nextLine();
		admin1.setsCity(city);
		
		System.out.println("State:");
		state = sc.nextLine();
		admin1.setsState(state);
		
		System.out.println("Zip:");
		zip =sc.nextLine();
		admin1.setsZip(zip);
		
		System.out.println("Username:");
		UserName = sc.nextLine();
		admin1.setsUserName(UserName);
		
		System.out.println("password:");
		password = sc.nextLine();
		admin1.setsPassword(password);
		
		System.out.println("Email:");
		Email = sc.nextLine();
		admin1.setsEmail(Email);
		
		System.out.println("SSNumber:");
		ssn = sc.nextLine();
		admin1.setlSSN(ssn);
		
		System.out.println("Question:");
		S_Question = sc.nextLine();
		admin1.setsSecurity_Question(S_Question);
	
		Flight myFlight = new Flight();
		myFlight.addFlight("Atlanta");
			
		System.out.println(admin1.toString());
	
		
		
	}

}
