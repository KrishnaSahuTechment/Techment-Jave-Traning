package com.techment.day6.exception;

import java.io.*;

class Student
{
	
	void checkEligibiliy(int age) throws FileNotFoundException
	{
		if (age >=18)
			System.out.println("you can apply loan");
		else
			throw new FileNotFoundException("you cannot apply");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.checkEligibiliy(16);
	}

}
