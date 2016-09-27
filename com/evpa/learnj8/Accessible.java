package com.evpa.learnj8;

public interface Accessible {
	public void access();
	default public void print() {
		System.out.println("Accessible");
	}	
}