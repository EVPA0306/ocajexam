package com.evpa.ocajexam.exercises.chaptereleven;

public class Guitar {
	public static void main(String[] args) {
		Strummable instrument = () -> { System.out.println("Strummed!!!");};
		instrument.strum();
		System.out.println(instrument);
		System.out.println(Strummable.silent());
		//int length = (String s) -> { return s.length();};
		//(Strummable s) -> { s.strum();};
	}


	@FunctionalInterface
	public interface Strummable {
		void strum();
		default void sound(Object object) {}
		static String silent() {
			return "Interface Strummable";
		}
	}
}