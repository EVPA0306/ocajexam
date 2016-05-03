package com.evpa.ocajexam.exercises.chaptereleven;

import java.util.List;
import java.util.ArrayList;
import java.util.function.*;
import java.time.*;

public class RosterTest {
	public static void main(String[] args) {

		List<Person> roster = new ArrayList<>();
		roster.add( new Person("Evgeny",LocalDate.of(1973,06,24), Person.Sex.MALE, 42, "evgeny@gmail.com") );
		roster.add( new Person("Marina",LocalDate.of(1974,11,17), Person.Sex.FEMALE, 41, "marina@gmail.com") );		
		roster.add( new Person("Aleksandra",LocalDate.of(2004,05,21), Person.Sex.FEMALE, 12, "aleksandra@gmail.com") );
		roster.add( new Person("Ivan",LocalDate.of(2011,05,11), Person.Sex.MALE, 5, "ivan@gmail.com") );
		roster.add( new Person("Galina",LocalDate.of(1951,06,13), Person.Sex.FEMALE, 65) );
		//printPersonOlderThan(roster,40);
		//printPersons(roster, new PersonChecker());
		//Using the anonymous class
		/*printPersons(roster,
				new PersonChecker() {
					public boolean check(Person p) {
						return p.getGender() == Person.Sex.MALE &&
							p.getAge() >= 4 &&
							p.getAge() <= 40;
					}
				} 
			);*/
		//With lambda expressions
		/*printPersons(roster, 
				(Person p) -> p.getGender() == Person.Sex.MALE &&
					p.getAge() >= 20 &&
					p.getAge() <= 50
			);*/
	
		/*
		printPersonsWithPredicate(roster,
				p -> p.getGender() == Person.Sex.FEMALE &&
					p.getAge() >= 20 &&
					p.getAge() <= 40
 			);
		processPerson(roster,
				p -> p.getGender() == Person.Sex.FEMALE &&
					p.getAge() >= 40 &&
					p.getAge() <= 70,
				p -> p.printPerson()
			);*/
		processPersonWithFunction(roster,
				p -> p.getGender() == Person.Sex.MALE &&
					p.getAge() >= 1 &&
					p.getAge() <= 25,
				p -> p.getEmail(),
				email -> System.out.println(email)
			);
	}//main

	public static void processPersonWithFunction(List<Person> roster, Predicate<Person> tester,
		Function<Person, String> mapper, Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}

	}

	public static void processPerson(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				block.accept(p);
			}
		}
	}

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster ) {
			if (tester.test(p)){
				p.printPerson();
			}
		}
	}

	public static void printPersonOlderThan(List<Person> roster, int age) {
		for(Person p : roster) {
			if (p.getAge() > age) {
				p.printPerson();
			}
		}
	}

	public static void printPersons(List<Person> roster, CheckPerson checker) {
		for (Person p: roster) {
			if (checker.check(p)) {
				p.printPerson();
			}
		}
	}


}