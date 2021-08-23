package com.techment.day10.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter date of irth");
		
		String dob = scanner.next();
		System.out.println("DOB: "+dob);
		
		
//		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		LocalDate birthDate = LocalDate.parse(dob, dtf1);
//		System.out.println(" birthDate: "+birthDate);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDate2 = LocalDate.parse(dob, dtf2);
		System.out.println(" birthDate: "+birthDate2);
		
	}

}
