package com.evpa.ocajexam.exercises.chaptereight;

import java.io.*;

public class Logger {

	private BufferedWriter out;

	public Logger() throws IOException {
		out = new BufferedWriter(new FileWriter("logfile.txt"));
	}

	public void appendLog(Logable logable) throws IOException {
		out.write("Object history: " + logable.getInitInfo());
		out.newLine();
		out.write("Object log event: " + logable.getLogableEvent());
		out.newLine();
	}

	public void close() throws IOException {
		out.flush();
		out.close();
	}
}