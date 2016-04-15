package com.evpa.ocajexam.exercises.chaptereight;

public class NetworkConnection implements Logable {

	private long createdTimestamp;
	private String currentLogMessage;

	public NetworkConnection() {
		createdTimestamp = System.currentTimeMillis();
		currentLogMessage = "Initialized";
	}

	public void connect() {
		currentLogMessage = "Connected at " + System.currentTimeMillis();
	}

	public String getInitInfo() {
		return "NetworkConnection object created at " + createdTimestamp;
	}
 	public String getLogableEvent() {
 		return currentLogMessage;
 	}

}