package com.example.demo;

public class Address {
	
	private String addressLine1;
	private String addressLine2;
	private String postCode;
	private String administrativeArea;
	private String locality;
	private String country;
	private String validated;
	ObjectReference addressType = new ObjectReference();
	private String markettingPreferences;
	
	public Address()
	{
		this.addressLine1 = "BB Road";
		this.addressLine2 = "Raikanan";
		this.postCode = "742101";
		this.administrativeArea = "Municipality";
		this.locality = "Berhampore";
		this.country = "India";
		this.validated = "validated";
		this.markettingPreferences = "Field Market";
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getPostCode() {
		return postCode;
	}
	public String getAdministrativeArea() {
		return administrativeArea;
	}
	public String getLocality() {
		return locality;
	}
	public String getCountry() {
		return country;
	}
	public String getValidated() {
		return validated;
	}
	public ObjectReference getAddressType() {
		return addressType;
	}
	public String getMarkettingPreferences() {
		return markettingPreferences;
	}
	
}
