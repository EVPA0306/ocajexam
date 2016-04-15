package com.evpa.ocajexam.exercises.chaptereight;

public class TypeB extends TypeA {
	public void methodB() {
		System.out.println("Method B");
	}

	@Override
	public void whoAmI() {
		System.out.println("TypeB");
	}
}