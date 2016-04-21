package com.evpa.ocajexam.exercises.chapterten;

import java.time.*;
import java.util.*;
import java.time.format.*;
//import static java.time.format.*;

public class CheckDateFormatters{

	public static void main(String[] args) {
		
		List<DateTimeFormatter> ldtFormatter = new ArrayList<>();

		ldtFormatter.add(DateTimeFormatter.BASIC_ISO_DATE);
		ldtFormatter.add(DateTimeFormatter.ISO_LOCAL_TIME);
		ldtFormatter.add(DateTimeFormatter.ISO_LOCAL_DATE);
		//ISO_WEEK_DATE

		LocalDateTime ldt = LocalDateTime.now();
		/*ldtFormatter.forEach(c -> {
					System.out.println(ldt.format(c));
				}
			);*/
		Period p = Period.parse("P1Y");
		System.out.println(p.getMonths());

		//System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

		LocalDate ld = LocalDate.of(1940,Month.JANUARY,3);
		ld = ld.minusYears(3).plusMonths(10).plusDays(15);
		ld.minusYears(10);//Immutable!!!
		System.out.println(ld.getMonth() + " " + ld.getYear());

		System.out.println("Four");
		String date1 = "2011-12-03";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate LocalDate1 = LocalDate.parse(date1,formatter1);
		System.out.print(LocalDate1.toString() + " ");
		String date2 = "2011-12-03T00:00:00";
		DateTimeFormatter formatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime LocalDate2 = LocalDateTime.parse(date2,formatter2);
		System.out.println(LocalDate2);
	}
}