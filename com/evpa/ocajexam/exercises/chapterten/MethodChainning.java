package com.evpa.ocajexam.exercises.chapterten;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.*;

public class MethodChainning {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusYears(14);
		System.out.println(ldt);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		Period p1 = Period.of(1,1,1);
		System.out.println(p1.plusDays(6).withDays(10));
		Period p2 = Period.parse("P0Y13M");
		System.out.println(p2.normalized());
		LocalDate ld = LocalDate.now();
		System.out.println("Local Date: " + ld);
		System.out.println("Local Date formatted : " + ld.format(DateTimeFormatter.ISO_WEEK_DATE));
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Zoned Date formatted : " + zdt.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
