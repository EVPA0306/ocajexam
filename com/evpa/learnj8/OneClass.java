package com.evpa.learnj8;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import static java.util.Locale.ITALY;

public class OneClass {
	public static void main(String[] args) {
		Console console = System.console();
		String planet = console.readLine("\nEnter your favorite planet: ");
		List<String> planetList = new ArrayList<>();
		planetList.add(planet);
		planetList.add("Jupiter");
		System.out.println("\nTwo cool planets: " + planetList);
		System.out.println("Locale: " + ITALY);
	}
}