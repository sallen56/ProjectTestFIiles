package person;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TestCustomer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
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
		Customer theCustomer = new  Customer(
				fname, lname, address,city,state,zip, 
				UserName, password, Email,ssn,S_Question);
		System.out.println("Please enter your full name:");

		theCustomer.setsFirstName(sc.next());  
		theCustomer.setsLastName( sc.nextLine());
		System.out.println("Address:");
	
		theCustomer.setsAddress(sc.nextLine());
		
		
		System.out.println("City:");
		
		theCustomer.setsCity(sc.nextLine());
		
		System.out.println("State:");
		
		theCustomer.setsState(sc.nextLine());
		
		System.out.println("Zip:");
		
		theCustomer.setsZip(sc.nextLine());
		
		System.out.println("Username:");
		 
		theCustomer.setsUserName(sc.nextLine());
		
		System.out.println("password:");
		
		theCustomer.setsPassword(sc.nextLine());
		
		System.out.println("Email:");
		
		theCustomer.setsEmail(sc.nextLine());
		
		System.out.println("SSNumber:");
		
		theCustomer.setlSSN(sc.nextLine());
		
		System.out.println("Question:");
		
		theCustomer.setsSecurity_Question(sc.nextLine());
	    theCustomer.newCustomer(
	    theCustomer.getsFirstName(), theCustomer.getsLastName(),
	    theCustomer.getsAddress(),theCustomer.getsCity(),theCustomer.getsState(),theCustomer.getsZip(),
	    theCustomer.getsUserName(),theCustomer.getsPassword(),
	    theCustomer.getsEmail(), theCustomer.getlSSN(),
	    theCustomer.getsSecurity_Question());	    
	    System.out.println(theCustomer.toString());
		
	}

}
