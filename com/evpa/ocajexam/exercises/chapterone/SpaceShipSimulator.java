package com.evpa.ocajexam.exercises.chapterone;

import com.evpa.ocajexam.exercises.chapterone.Ship.ShipType;

public class SpaceShipSimulator {
	public static void main(String[] args) {
		Ship ship1 = new SpaceShip();
		System.out.println(ship1);

		Ship ship2 = new SpaceShip(ShipType.FRIGATE);
		System.out.println(ship2);
	}
}