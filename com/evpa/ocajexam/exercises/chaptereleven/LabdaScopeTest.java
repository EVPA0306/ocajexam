package com.evpa.ocajexam.exercises.chaptereleven;

import java.util.function.*;

public class LabdaScopeTest {

	public int x = 0;

	class FirstLevel {

		public int x = 1;

		void methodFirstLevel(int x) {
			Consumer<Integer> myConsumer = (y) -> 
				{
					System.out.println("x = " + x);
					System.out.println("y = " + y);
					System.out.println("this.x = " + this.x);
					System.out.println("LabdaScopeTest.this.x = " + LabdaScopeTest.this.x);
				};
			myConsumer.accept(x);
		}
	}
	public static void main(String[] args) {
		LabdaScopeTest lst = new LabdaScopeTest();
		LabdaScopeTest.FirstLevel fl = lst.new FirstLevel();
		fl.methodFirstLevel(23);
	}
}