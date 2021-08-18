package com.techment.day10.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate currentDate = LocalDate.now();
		
		System.out.println("LocalDate  ="+currentDate );
		
		LocalDateTime datettime = LocalDateTime.now();
		LocalDate birthdate = LocalDate.of(1995, 10, 20);
	}

}
