package com.evpa.learnj8;

public class Invoice {
	
	private int id;
	private Double amount;
	private String customer;

	public Invoice(int id, String customer, Double amount) {
		
		this.id = id;
		this.amount = amount;
		this.customer = customer;
	}

	public Double getAmount() {
		return this.amount;
	}
	public String getCustomer() {
		return this.customer;
	}

	public int getId() {
		return this.id;
	}
}