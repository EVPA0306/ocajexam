package com.evpa.learnj8;

import java.io.*;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class TestNewJ8 {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Hi")).start();
		Runnable r = () -> System.out.println("Hello");
		new Thread(r).start();
		FileFilter isClass = (File f) -> f.getName().endsWith(".class");
		Ship ship = (String name) -> new String("Aurora");
		//File[] hiddenFiles = mainDirectory.listFiles(f -> f.isHidden());
		Function<String, Integer> conventer = Integer::parseInt;
		Integer number = conventer.apply("10");
		System.out.println("Number: " + number);
		//Supplier<List<String>> list = List::new;
		List<Invoice> invoices = new ArrayList<>();
		/*Collections.sort(invoices, new Comparator<Invoice>()
			{
				public int compare(Invoice inv1, Invoice inv2) {
					return Double.compare(inv1.getAmount(), inv2.getAmount());
				}
			});

		Collections.sort(invoices, (Invoice inv1, Invoice inv2) -> 
			{return Double.compare(inv1.getAmount(), inv2.getAmount());}
			);

		invoices.sort( (Invoice inv1, Invoice inv2) -> Double.compare( inv1.getAmount(),inv2.getAmount() ));

		Comparator<Invoice> byAmount = Comparator.comparing(Invoice::getAmount);*/

		
		List<Invoice> ids = invoices.stream().filter(inv -> inv.getCustomer() == "ORACLE").collect(Collectors.toList());
		}

	/*public void getHiddenFiles() {

		File[] hiddenFiles = mainDirectory.listFiles(File::isHidden);
	}*/
}