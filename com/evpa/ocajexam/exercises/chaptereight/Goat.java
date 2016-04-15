package com.evpa.ocajexam.exercises.chaptereight;

public class Goat implements Describable {
	private String description;

	public Goat(String name) {
		description = "This goat named " + name;
	}

	public String getDescription() {
		return description;
	}
}