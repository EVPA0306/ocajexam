package com.evpa.ocajexam.exercises.chapterone;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class ExerciseOne {
	public static void main(String[] args) throws IOException {

		Files.createDirectories(Paths.get("logs"));
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
		LocalDateTime now = LocalDateTime.now();
		String date = now.format(df);
		String logFileName = "logs/testlog-" + date + ".txt";
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocaJLogger = Logger.getLogger("OCAJ Logger");
		ocaJLogger.setLevel(Level.ALL);
		ocaJLogger.addHandler(myFileHandler);
		ocaJLogger.info("\nThis is a logged information message");
		myFileHandler.close();
	}
}