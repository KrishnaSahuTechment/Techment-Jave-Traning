package com.techment.day6.exception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Name is krishna ");
		System.out.println("Email is krishna.sahu@techment.com ");
		int arr[] = new int[5];
		try {
			System.out.println(1/0);
			arr[7] =24;
			System.out.println(8/2);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception "+e);	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception "+e);	
		}
		catch(Exception e) {
		System.out.println("Exception "+e);	
		}
		
		System.out.println("Contact 9522222892 ");
	}

}
