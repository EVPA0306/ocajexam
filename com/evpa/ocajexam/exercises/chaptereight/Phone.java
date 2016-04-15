package com.evpa.ocajexam.exercises.chaptereight;

public class Phone {
	public void callNumber(long number) {
		System.out.println(this + " Calling number " + number);
	}

	public boolean isRinging() {
		System.out.println(this + " Checking if phone is ringing");
		boolean ringing = false;
		return ringing;
	}

	public String toString() {
		return "Phone:";
	}
}