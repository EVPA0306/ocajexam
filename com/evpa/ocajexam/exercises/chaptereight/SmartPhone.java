package com.evpa.ocajexam.exercises.chaptereight;

public class SmartPhone extends Phone {

	public void sendEmail(String message, String address) {
		System.out.println(this + " Sending Email");
	}

	public String retrieveEmail() {
		System.out.println(this + " Retrieving Email");
		String messages = new String();
		return messages;
	}
	@Override
	public boolean isRinging() {
		System.out.println(this  + " Checking if phone is ringing");
		boolean ringing = false;
		return ringing;
	}

	public String toString() {
		return "SmartPhone:";
	}
}