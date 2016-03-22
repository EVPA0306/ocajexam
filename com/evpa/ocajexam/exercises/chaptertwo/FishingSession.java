package com.evpa.ocajexam.exercises.chaptertwo;


public class FishingSession {

	private String sessionState = "inactive";


	public String getSessionState() {
		return sessionState;	
	}

	public void setSessionState(String sessionState) {
		this.sessionState = sessionState;
	}

	public void fishingByHour() {
		int totalHoursFishig = 0;
		int allowedHoursFishing = 4;
		for (int i=1 ; i < 25; i++) {
			totalHoursFishig = ++totalHoursFishig;
			if(totalHoursFishig > allowedHoursFishing) 
				break;
			System.out.println("Fishing for hour " + i + ".");
		}
	}

	public void activitesByDay() {
		int totalDaysCamping = 0;
		int allowedDaysFishing = 5;
		for (int i=1; i<8; i++) {
			System.out.println("\nDay " + i + ": camping");
			totalDaysCamping++;
			if(totalDaysCamping > allowedDaysFishing) 
				continue;
				System.out.println("and fishing");
		}
	}

	public void test12() {
		boolean isValid = true;
		while(isValid) {
			isValid = false;
			System.out.println("test1");
			if(isValid = true) {
				System.out.println("test2");
				break;
			}
			isValid = false;
			System.out.println("test3");
				if (true) ;
				if (true) {}
				if (true) {;}
				if (true) {;;}
				if (true) ;{};
		}
	}
}