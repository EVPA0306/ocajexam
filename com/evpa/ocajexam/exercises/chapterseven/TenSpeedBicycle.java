package com.evpa.ocajexam.exercises.chapterseven;

public class TenSpeedBicycle extends Bicycle {
	private float wheelRPM;
	//private int degreeOfTurn;
	private float gearRatio = 2F;

	public void setGearRatio(float gearRatio) {
		this.gearRatio = gearRatio;
	}
	public void pedalRPM(float pedalRPM) {
		this.wheelRPM = pedalRPM * gearRatio;
	}

	public float wheelRPM() {
		return wheelRPM;
	}
}