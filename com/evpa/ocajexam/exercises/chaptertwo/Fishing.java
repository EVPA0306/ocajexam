package com.evpa.ocajexam.exercises.chaptertwo;

import java.util.List;
import java.util.ArrayList;

public class Fishing {

	public static void main(String[] args) {

		int[] hookSizes = new int[] {1,2,3,4,5,6,7,8,9};
		Fish fish = new Fish();
		/*System.out.println(fish.generateRandomFish("DRUM"));	
		for (int i : hookSizes) {
			System.out.println(i);
		}*/
		List<Float> fishLengthList = new ArrayList<>();
		fishLengthList.add(10.0f);
		fishLengthList.add(15.5f);
		fishLengthList.add(18.0f);
		fishLengthList.add(29.5f);
		fishLengthList.add(45.5f);
		/*for (float fishSize : fishLengthList) {
			if ( fishSize > 28.0f) 
				System.out.println("Size: " + fishSize);
		}*/

		FishingSession fishingSession = new FishingSession();
		fishingSession.setSessionState("active");

		fishingSession.fishingByHour();
		fishingSession.activitesByDay();
		fishingSession.test12();
	}
}