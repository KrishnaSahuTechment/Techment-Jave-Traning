package com.techment.day10.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		
		DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter longDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println(today.format(full));
		System.out.println(today.format(longDate));
		System.out.println(today.format(medium));
		System.out.println(today.format(shortDate));
		
		LocalDateTime todayDateTime = LocalDateTime.now();
		
		System.out.println("today date: "+todayDateTime);
		
		DateTimeFormatter fullTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		
		
		
		System.out.println("full  : "+todayDateTime.format(fullTime));
		System.out.println("short  : "+todayDateTime.format(shortDate));
		
		ZonedDateTime ZoneDate = ZonedDateTime.now();
		
		System.out.println("ZoneDate: "+ZoneDate);
		System.out.println("ZoneDate: "+ZoneDate.format(fullTime));
		
	}

}
