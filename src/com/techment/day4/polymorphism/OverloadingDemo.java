package com.techment.day4.polymorphism;


class Overload
{
	public void addition(int num,int num2)
	{
		System.out.println("this is addtion of two numbers = "+(num+num2));
	}
	public void addition(int num1,int num2,int num3)
	{
		System.out.println("this is the addition of three numbers = "+(num1+num2+num3));
	}
	
}

public class OverloadingDemo extends Overload {
	public static void main(String[] args)
	{
		
		
		OverloadingDemo demo = new OverloadingDemo();
		demo.addition(5,6);
		demo.addition(5,6,7);
	}
	
}
