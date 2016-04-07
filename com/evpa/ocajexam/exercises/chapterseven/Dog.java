package com.evpa.ocajexam.exercises.chapterseven;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Woof! Woof!");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog eats");
	}
}