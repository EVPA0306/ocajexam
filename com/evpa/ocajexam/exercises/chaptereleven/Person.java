package com.evpa.ocajexam.exercises.chaptereleven;

import java.time.*;

public class Person {
	public enum Sex {
		MALE, FEMALE
	}
	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String email;
	private int age;

	public Person() {}

	
	public Person(String name, LocalDate birthday, Sex gender, int age) {
		this.name 		= name;
		this.birthday 	= birthday;
		this.gender 	= gender;
		this.age 		= age;
	}

	public Person(String name, LocalDate birthday, Sex gender, int age, String email) {
		this(name, birthday, gender, age);
		this.email = email;
	}

	public void printPerson() {
		System.out.println("Person: " + this.name + ", " + gender + ", " + birthday);
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public LocalDate getBirthday() {
		return birthday;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public Sex getGender() {
		return gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}