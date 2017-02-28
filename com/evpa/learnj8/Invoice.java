package com.evpa.learnj8;

public class Invoice {
	
	private int id;
	private Double amount;
	private String customer;
	private String title;

	public Invoice(int id, String customer, Double amount, String title) {
		
		this.id = id;
		this.amount = amount;
		this.customer = customer;
		this.title = title;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return String.format(
				"Invoice[id=%d, customer='%s', title='%s', amount='%d']",
				id, customer, title, amount);
	}
}