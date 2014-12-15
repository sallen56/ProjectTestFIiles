package org.person;

import java.util.ArrayList;

public class Flight {
	
	ArrayList<String> Flight = new ArrayList<String>();
	private String state;
	private String city;
	private String arrive;
	
	
	public void addFlight(String flight){
		Flight.add(flight);
	}
	

	@Override
	public String toString() {
		return "Flight [myFlight=" + Flight + ", state=" + state + ", city=" + city
				+ ", arrive=" + arrive + "]";
	}
	
 
}
