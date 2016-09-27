package com.evpa.learnj8;

public interface Clickable {
	public void click();
	default public void print() {
		System.out.println("Clickable");
	}
}