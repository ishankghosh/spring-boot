package com.example.demo;

public class Telephone {
	
	private String countryCode;
	private String areaCode;
	private String number;
	private String extension;
	private String phoneType;
	private String marketingPreferences;
	private String validated;
	private String preferredContactTimes;
	
	public Telephone()
	{
		this.countryCode = "+91";
		this.areaCode = "01";
		this.number = "8971302312";
		this.extension = "248965";
		this.phoneType = "Landline";
		this.marketingPreferences = "None";
		this.validated = "True";
		this.preferredContactTimes = "Day Shift";
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public String getNumber() {
		return number;
	}
	public String getExtension() {
		return extension;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public String getMarketingPreferences() {
		return marketingPreferences;
	}
	public String getValidated() {
		return validated;
	}
	public String getPreferredContactTimes() {
		return preferredContactTimes;
	}
	

}
