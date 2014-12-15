package person;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestUsers {
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
		System.out.println("Name:");
		fname =  sc.next();
		theCustomer.setsFirstName(fname);
		lname = sc.nextLine();
		theCustomer.setsLastName(lname);
		
		System.out.println("Address:");
		address = sc.nextLine();
		theCustomer.setsAddress(address);
		
		
		System.out.println("City:");
		city = sc.nextLine();
		theCustomer.setsCity(city);
		
		System.out.println("State:");
		state = sc.nextLine();
		theCustomer.setsState(state);
		
		System.out.println("Zip:");
		zip =sc.nextLine();
		theCustomer.setsZip(zip);
		
		System.out.println("Username:");
		UserName = sc.nextLine();
		theCustomer.setsUserName(UserName);
		
		System.out.println("password:");
		password = sc.nextLine();
		theCustomer.setsPassword(password);
		
		System.out.println("Email:");
		Email = sc.nextLine();
		theCustomer.setsEmail(Email);
		
		System.out.println("SSNumber:");
		ssn = sc.nextLine();
		theCustomer.setlSSN(ssn);
		
		System.out.println("Question:");
		S_Question = sc.nextLine();
		theCustomer.setsSecurity_Question(S_Question);
	
	System.out.println(theCustomer.toString());
	
	
	
		
	}// end of main
}// end of class
