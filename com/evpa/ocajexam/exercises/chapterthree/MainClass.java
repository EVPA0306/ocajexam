package com.evpa.ocajexam.exercises.chapterthree;

public class MainClass {
	public static void main(String[] args) {
		byte a = 10;
		System.out.println("1. " + (a += 3));
		a = 15;
		System.out.println("2. " + (a -= 3));
		a = 20;
		System.out.println("3. " + (a *= 3));
		a = 25;
		System.out.println("4. " + (a /= 3));
		a = 104;
		System.out.println("5. " + (a %= 3));
		a = 35;
		System.out.println(a &= 3);
		a = 40;
		System.out.println(a ^= 3);
		a = 45;
		System.out.println(a |= 3);
		a = 50;
		System.out.println(a <<= 3);
		a = 55;
		System.out.println(a >>= 3);
		a = 60;
		System.out.println(a >>>= 3);
		byte y = 1;
		System.out.println(y = ++y);
		boolean c = true;
		boolean b = false;
		System.out.println(c | b);
		//float reale = .007812f;
		//float escudo = .125f;
		int reale = 8;
		int escudo = 12;
		System.out.println(reale + escudo + " sum of int");
		System.out.println("sum of int " + reale + escudo );
	}
}

