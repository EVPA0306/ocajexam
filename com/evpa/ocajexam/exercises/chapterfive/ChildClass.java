package com.evpa.ocajexam.exercises.chapterfive;

public class ChildClass extends ParentClass {

	private int size;
	public static final double PI = 3.1459D;

	public ChildClass() {
		//super(s);
		//super();
		System.out.println("ChildClass default constructor ");
	}

	public ChildClass(int size) {
		size = size;
	}

	public ChildClass(String s) {
		//super(s);
		System.out.println("ChildClass constructor " + s);
	}

	public String className() {
		//return "ChildClass";
		return super.className();
	}

	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		//ChildClass ch1 = new ChildClass("test");
		//ParentClass pc = new ChildClass("test");
		System.out.println(ch.className());
		ChildClass ch5 = new ChildClass(5);
		System.out.println(ch5.size);
	}
}