package com.example.demo;

public class Person {

	private String firstName;
	private String lastName;
	private String middleInitials;
	private String title;
	private String dob;
	
	public Person()
	{
		this.firstName = "Ishan";
		this.lastName = "Ghosh";
		this.middleInitials = "Kumar";
		this.title = "Mr.";
		this.dob = "11-02-1993";
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddleInitials() {
		return middleInitials;
	}
	public String getTitle() {
		return title;
	}
	public String getDob() {
		return dob;
	}
	
}
