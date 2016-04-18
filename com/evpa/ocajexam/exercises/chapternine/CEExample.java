package com.evpa.ocajexam.exercises.chapternine;

import java.io.*;

public class CEExample implements Runnable {
	public static void main(String[] args) throws MyException {
		Thread th = new Thread(new CEExample());
		th.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		throw new MyException("Oops");	
	}

	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Alive!!!");
		}
	}
} 