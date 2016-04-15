package com.evpa.ocajexam.exercises.chaptereight;

public class Tester {

	public static void main(String[] args) {
		new Tester();
	}

	public Tester() {
		Phone landLinePhone = new Phone();
		SmartPhone smartPhone = new SmartPhone();
		testPhone(landLinePhone);
		testPhone(smartPhone);
		testSmartPhone(smartPhone);
	}

	private void testPhone(Phone phone) {
		phone.callNumber(555_555_5555L);
		phone.isRinging();
	}

	private void testSmartPhone(SmartPhone phone) {
		phone.sendEmail("Hi","email@mail.ru");
		phone.retrieveEmail();
	}
}