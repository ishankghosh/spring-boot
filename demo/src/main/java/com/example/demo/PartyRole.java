package com.example.demo;

public class PartyRole {

	Customer customer = new Customer();
	Employee employee = new Employee();
	Supplier supplier = new Supplier();
	Lead lead = new Lead();
	
	public PartyRole() {
		
	}
	public Customer getCustomer() {
		return customer;
	}
	public Employee getEmployee() {
		return employee;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public Lead getLead() {
		return lead;
	}
	
}
