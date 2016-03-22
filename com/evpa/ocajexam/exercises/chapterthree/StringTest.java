package com.evpa.ocajexam.exercises.chapterthree;

public class StringTest {
	public static void main(String[] args) {
		//String s1 = new String("String one");
		String s1 = "String one";
		String s2 = "String two";
		String s3 = "String " + "three";

		String pirateMessage = "  Buried Treasure Chest! ";
		char c2 = pirateMessage.charAt(2);
		System.out.println(c2);
		char c3 = pirateMessage.charAt(3);
		int len = pirateMessage.length();
		System.out.println(len);
		String[] arr = new String[3];
		System.out.println(arr.length);
		String c = pirateMessage.concat("Weigh anchor!");
		System.out.println(c);
		System.out.println(pirateMessage);
		String ss = pirateMessage.substring(9,23);
		System.out.println(ss);
		System.out.println(" ".equals("\u0020"));
		System.out.println(pirateMessage.trim());

		//
		StringBuilder mateyMessage = new StringBuilder("Shiver Me Timbers");
		System.out.println(mateyMessage.append(". Bad Storm!").append('\u0020').append('\u0045').append('\u0020')
			.append(2d).append('\u0020').append(3L));
		System.out.println(mateyMessage.insert(17, " and Bricks! "));
		StringBuilder re = new StringBuilder("part");
		System.out.println(re.reverse());	
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("sb"));
		char[] charArray = new char[] {'a','b','c'};
		CharSequence cs = "CharSequence";
		StringBuilder sbchr = new StringBuilder(cs);
		System.out.println(sbchr);
		CharSequence csOne = new StringBuilder("test StringBuilder");
		System.out.println(csOne);
		StringBuilder intSB = new StringBuilder(45);
		intSB.insert(40,"Trying to insert long string");
		System.out.println(intSB.capacity());

	}
}