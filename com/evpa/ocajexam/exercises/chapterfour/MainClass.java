package com.evpa.ocajexam.exercises.chapterfour;

import java.util.List;
import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {

		ChapterFour c4 = new ChapterFour();
		c4.byteVar = (byte)-128;
		System.out.println("byteVar: 	" 	+ c4.byteVar);
		System.out.println("charVar: 	" 	+ c4.charVar);
		System.out.println("shortVar: 	" 	+ c4.shortVar);
		System.out.println("intVar: 	" 	+ c4.intVar);
		System.out.println("longVar: 	" 	+ c4.longVar);
		System.out.println("floatVar: 	" 	+ c4.floatVar);
		System.out.println("doubleVar: 	"	+ c4.doubleVar);
		System.out.println("booleanVar: "	+ c4.booleanVar);

		List<Short> list = new ArrayList<Short>();
		list.add(new Short("1"));
		list.add(new Short("2"));
		//
		Car car = new Truck(230,true);
		car.startEngine();
		System.out.println("Car is " + car.isRunning());
		System.out.println("Car top speed is " + car.getTopSpeed());
		System.out.println(car);

		int[] testScore = new int[3];
		System.out.println(testScore.length);

		Suit cardSuit;
		cardSuit = Suit.HEARTS;
		if (cardSuit == Suit.HEARTS) {
			System.out.println("This suit of this card is hearts");
		}
		float x = 0.0f;
		int y = 5;
		x = y + 3.3f;
		long z = 0L;
		x = x + z;
		System.out.println(x);
	}
}