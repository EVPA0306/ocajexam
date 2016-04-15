package com.evpa.ocajexam.exercises.chaptereight;

public class GoatTester {

	public static void main(String[] args) {
		new GoatTester();
	}

	public GoatTester() {
		Goat goat = new Goat("Bob");
		GoatShelter goatShelter = new GoatShelter(4,4,6);
		System.out.println(description(goat));
		System.out.println(description(goatShelter));
	}

	private String description(Describable d) {
		return d.getDescription();
	}
}