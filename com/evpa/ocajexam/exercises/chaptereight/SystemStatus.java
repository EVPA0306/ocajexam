package com.evpa.ocajexam.exercises.chaptereight;

public class SystemStatus implements Logable {
	private long createdTimestamp;

	public SystemStatus() {
		createdTimestamp = System.currentTimeMillis();
	}

	private int getStatus() {
		if(System.currentTimeMillis() - createdTimestamp > 1000) {
			return 1;
		}
			else {
				return -1;
			}
	}

 	public String getInitInfo() {
 		return "SystemStatus object created at " + createdTimestamp;
 	}
 	public String getLogableEvent() {
 		return String.valueOf(getStatus());
 	}
}