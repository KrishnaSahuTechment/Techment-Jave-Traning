package com.techment.day4.encapsulation;

class Parent
{
	int a=20;
	
}

class Child extends Parent
{
	int a=10;
	void sum()
	{ int a = 5;
		int c = a+a;
		System.out.println("Sum c = "+c);
		System.out.println("local in method  a = "+a);
		
		int d = this.a+a;
		System.out.println("Sum d = "+d);
		System.out.println("this object in child class  a = "+this.a);
		
		int e = super.a+a;
		System.out.println("Sum e = "+e);
		System.out.println("super object from super class  a = "+super.a); 
		
		int f = super.a+this.a;
		System.out.println("Sum f = "+f);


	}
}


public class SuperVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.sum();
	}

}
