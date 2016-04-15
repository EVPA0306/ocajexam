package com.evpa.ocajexam.exercises.chaptereight;

public class ChapterEight {
	public static void main(String[] args) {
		TypeB obj1 = new TypeB();
		TypeA obj2 = new TypeB();
		TypeA obj3 = new TypeA();
		//var3.methodA();
		//var3.methodB();
		System.out.print("obj1: ");
		obj1.whoAmI();
		System.out.print("obj2: ");
		obj2.whoAmI();
		if (obj2 instanceof TypeB) {
			
			System.out.println("Casting happend");
			((TypeB) obj2).methodB();	
		}
		
		System.out.print("obj3: ");
		obj3.whoAmI();
	}
}