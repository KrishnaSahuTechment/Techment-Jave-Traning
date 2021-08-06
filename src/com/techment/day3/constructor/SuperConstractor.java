package com.techment.day3.constructor;

class Parent1
{
	int a;
	Parent1(int a)
	{
		System.out.println("this is Parent1 constructor a = "+a);
	}
	
}

class Child1 extends Parent1
{
	Child1(int x)
	{
		super(x);
		System.out.println("this is child1 constructor a = "+a);
	}
	
}

public class SuperConstractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 child1 = new Child1(5);
	}

}
