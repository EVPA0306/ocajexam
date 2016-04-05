package com.evpa.ocajexam.exercises.chaptersix;

import java.util.List;
import java.util.ArrayList;

public class MainClassArrayList {
	public static void main(String[] args) {
		List<Integer> basicArrayList = new ArrayList<>(15);
		Integer integerOne = new Integer(2);
		basicArrayList.add(1);
		basicArrayList.add(integerOne);
		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1));
		basicArrayList.add(0,new Integer(99));
		System.out.println("array size is: " + basicArrayList.size());
		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1) + " - " + basicArrayList.get(2));
		//System.out.println(basicArrayList.capacity());
	}
}