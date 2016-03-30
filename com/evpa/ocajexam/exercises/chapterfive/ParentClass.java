package com.evpa.ocajexam.exercises.chapterfive;

public class ParentClass {

	public ParentClass() {
		System.out.println("ParentClass default constructor");
	}

	public ParentClass(String s) {
		System.out.println("ParentClass constructor " + s);
	}

	public String className() {
		return "ParentClass";
	}
}