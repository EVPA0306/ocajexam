package com.evpa.ocajexam.exercises.chaptersix;

import java.util.List;
import java.util.ArrayList;

public class TemprList {
	public static void main(String[] args) {
		int[] basicTempList = {15,20,17,19,19,21,22};
		int[] arrInt = new int[6];
		System.out.println("Basic array size: " + basicTempList.length);
		int avgTemp = 0;
		for (int i=0; i<basicTempList.length; i++)
			avgTemp = avgTemp + basicTempList[i];
		System.out.println("Avearge basic temp: " + avgTemp / basicTempList.length);
		System.out.println("====================");
		Integer summ = new Integer(0);
		List<Integer> objectTempList = new ArrayList<>();
		objectTempList.add(new Integer(15));
		objectTempList.add(new Integer(20));
		objectTempList.add(new Integer(17));
		objectTempList.add(new Integer(19));
		objectTempList.add(new Integer(19));
		objectTempList.add(new Integer(21));
		objectTempList.add(new Integer(22));
		for (Integer intr : objectTempList)
			summ = summ + intr;
		System.out.println("Object array size: " + objectTempList.size());
		System.out.println("Avearge object temp: " + summ / objectTempList.size());
	}
}