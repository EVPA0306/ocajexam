package com.evpa.ocajexam.exercises.chapterfive;

import java.text.SimpleDateFormat;
import java.text.Format;
import java.util.Date;

public class Tools {
	public static String formatDate() {
		Date date = new Date();
		Format formatter = new SimpleDateFormat("MMM-dd-yy");
		return formatter.format(date);
	}

	public static void main(String[] args) {
		System.out.println(Tools.formatDate());
	}
}