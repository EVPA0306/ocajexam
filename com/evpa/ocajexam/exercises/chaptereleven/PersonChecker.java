package com.evpa.ocajexam.exercises.chaptereleven;

public class PersonChecker implements CheckPerson {
	public boolean check(Person p) {
		return p.getGender() == Person.Sex.FEMALE &&
			p.getAge() >= 10 &&
			p.getAge() <= 25;
	}
}