package com.espinsolutions.evince.util;

public class Member {

	private String firstName;
	private String lastName;
	private int token;

	public Member(String firstName, String lastName, int token) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.token = token;
		
	}
	
	public String getFirstName() { return firstName; }
	
	public String getLastName() { return lastName; }
	
	public int getToken() { return token; }
	
}
