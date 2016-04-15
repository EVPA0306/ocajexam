package com.evpa.ocajexam.exercises.chaptereight;

public class GoatShelter implements	Describable {
	
	private String description;
	private int height, width, length;

	public GoatShelter(int height, int width, int length) {
		this.height = height;
		this.width 	= width;
		this.length	= length;
		description = "A goat shelter";
	}

	public String getDescription() {
		return description;
	}
}