package com.evpa.ocajexam.exercises.chapterseven;

public class Bicycle {
	private float wheelRPM;
	private int degreeOfTurn;

	public void pedalRPM(float pedalRPM) {
		float gearRatio = 2F;
		this.wheelRPM = pedalRPM * gearRatio;
	}

	public void setDegreeOfTurn(int degreeOfTurn) {
		this.degreeOfTurn = degreeOfTurn;
	}

	public float getWheelRPM() {
		return this.wheelRPM;
	}

	public int getDegreeOfTurn() {
		return this.degreeOfTurn;
	}
}