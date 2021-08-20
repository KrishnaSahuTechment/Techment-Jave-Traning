//Program 17 Age Exception

package com.techment.assignmentsLogicBuild.program17;

import java.util.Scanner;



class InValidAgeException extends Exception
{
	InValidAgeException(String ageException)
	{
		super(ageException);
	}
	

}



public class AgeExceptionProgram {
	int age;
	
	public void valideAge(int age)throws InValidAgeException
	{
		if(age<18)
			throw new InValidAgeException(age+" Age is not valid for Voting !!");
		else
			System.out.print("You are eligible for voting ");
			
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age =  ");
		int age = scanner.nextInt();
		
		AgeExceptionProgram ages = new AgeExceptionProgram();
			
		ages.getAge();
		ages.setAge(age);
		try{
		ages.valideAge(age);
		}catch(Exception e)
		{
			System.out.print("Exception Occurred "+e);
		}
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
