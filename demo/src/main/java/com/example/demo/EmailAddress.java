package com.example.demo;

public class EmailAddress {
	
	private String email;
	private String validated;
	ObjectReference emailType = new ObjectReference();
	private String marketingPreferences;
	
	public EmailAddress()
	{
		this.email = "ishan.k.ghosh3@gmail.com";
		this.validated = "True";
	
		this.marketingPreferences = "None";
	}
	public String getEmail() {
		return email;
	}
	public String getValidated() {
		return validated;
	}
	public ObjectReference getEmailType() {
		return emailType;
	}
	public String getMarketingPreferences() {
		return marketingPreferences;
	}
	

}
