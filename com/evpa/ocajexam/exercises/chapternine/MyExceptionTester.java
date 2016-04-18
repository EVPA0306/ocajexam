package com.evpa.ocajexam.exercises.chapternine;

public class MyExceptionTester {

	public static void main(String[] args) {
		MyExceptionTester myTester = new MyExceptionTester();
		try {
			myTester.throwEx();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private void throwEx() throws MyException {
		throw new MyException("MyException thrown");
	}
}