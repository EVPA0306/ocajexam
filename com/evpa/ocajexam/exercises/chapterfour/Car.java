package com.evpa.ocajexam.exercises.chapterfour;

public abstract class Car {

	private int topSpeed;
	private boolean running;

	Car(int topSpeed, boolean running) {
		this.topSpeed = topSpeed;
		this.running = running;
	}

	public boolean isRunning() {
		return this.running;
	}

	public int getTopSpeed() {
		return this.topSpeed;
	}
	public abstract void startEngine();
}