package com.evpa.ocajexam.exercises.chapterone;

public class SpaceShip extends Ship implements Dockable {

	ShipType shipType = ShipType.BATTLESHIP;

	//Constructors
	public SpaceShip() {
		System.out.println("\nSpaceShip created with default ship type");
	}

	public SpaceShip(ShipType shipType) {
		System.out.println("\nSpaceShip created with specified ship type");			
		this.shipType = shipType;
	}

	@Override
	public void dock() {

	}

	@Override
	public String toString() {
		String shipTypeRefined = this.shipType.name().toLowerCase();
		return "This ship is a " + shipTypeRefined + " ship.";
	}
}