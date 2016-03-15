package com.evpa.ocajexam.exercises.chaptertwo;

import java.util.Random;

public class Fish {

	//public enum FishType {BASS, SKATE, SHARK, FISH, DRUM};

	public String generateRandomFish(String fishType) {
		
		String randomFish;
		Random randomObject = new Random();
		
		int randomNumber = randomObject.nextInt(4);
		//String randomString = randomObject.

		switch(fishType) {
			default:
				randomFish = "Unknown Fish Type";
				break;
			case "FISH":
				randomFish = "Blue Fish";
				break;
			case "DRUM":
				randomFish = "Red Drum";
				break;
			case "BASS":
				randomFish = "Striped Bass";
				break;
		}
		return randomFish;
	}
}