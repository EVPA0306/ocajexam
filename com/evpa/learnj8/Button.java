package com.evpa.learnj8;

public class Button implements Clickable /*, Accessible*/ {
	public void access() {
		System.out.println("access");
	}

	public void click() {
		System.out.println("click");
	}


	//public void print() {
	//	System.out.println("print");
	//}

	public static void main(String...args) {
		Button button = new Button();
		button.access();
		button.click();
		button.print();
        
	}
}