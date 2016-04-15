package com.evpa.ocajexam.exercises.chaptereight;

//import java.io.IOException;

public class LogTester {

	public static void main(String[] args) throws Exception {
		double detailedScore = 1.2D;
		float score = (float)detailedScore;
		byte b = (byte)1236;
		System.out.println(b);
		//new LogTester();
	}

	public LogTester() throws Exception {

		Logger logger = new Logger();
		SystemStatus systemStatus = new SystemStatus();
		NetworkConnection networkConnection = new NetworkConnection();
		logger.appendLog(systemStatus);
		logger.appendLog(networkConnection);
		networkConnection.connect();
		Thread.sleep(2000);
		logger.appendLog(systemStatus);
		logger.appendLog(networkConnection);
		logger.close();
	}
}