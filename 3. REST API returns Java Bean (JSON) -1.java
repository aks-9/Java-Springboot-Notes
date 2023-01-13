//* 3. REST API returns Java Bean (JSON) -1

// We first need to create a JAVA Bean class. Go to base package and right click > New > Class. Name it Student.

// This is Student.java file

package com.springboot.first.app;

public class Student {
	
	// create variables
	private String firstName;
	private String lastName;
	
	// constructor
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// right click > source > Getters/setters > Select all and click on generate.
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Now this is a java bean class.
	// Also create a constructor in similar manner,
	
	
	

}
