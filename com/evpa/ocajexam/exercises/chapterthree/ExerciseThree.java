package com.evpa.ocajexam.exercises.chapterthree;

public class ExerciseThree {
	public static void main(String[] args) {
		String eggs1 = "Cackle fruit";
		String eggs2 = "Cackle fruit ";
		System.out.println( eggs1.compareTo(eggs2) );
		System.out.println(49 % 26);
		System.out.println(23 % 5);
		System.out.println(true ^ !false);
		System.out.println(true & false);
		Double srt = Math.sqrt(17496L);
		System.out.println(srt);		
		if (3 % 5 == 0) {
			System.out.println(srt);
		}
		System.out.println((true | false & true) + ",");
		int score = 10;
		System.out.println("score: " + score++);
		String nameA = new String("Ben");
		//StringBuilder nameB = new StringBuilder("Ben");
		String nameB = new String("Ben");
		System.out.println(nameB.compareTo(nameA));
	}
}
	
