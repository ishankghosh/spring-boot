package com.example.demo;

public class PartyObject {
	
	Address address = new Address();
	Telephone tele = new Telephone();
	Person person = new Person();
	Organisation org = new Organisation();
	EmailAddress email = new EmailAddress();
	public PartyObject() {
		
	}
	public Address getAddress() {
		return address;
	}
	public Telephone getTele() {
		return tele;
	}
	public Person getPerson() {
		return person;
	}
	public Organisation getOrg() {
		return org;
	}
	public EmailAddress getEmail() {
		return email;
	}

	
}
