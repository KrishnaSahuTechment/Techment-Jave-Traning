package com.techment.day4.inheritance;

class Birds
{
	String name;

	public Birds(String name) {
		
		this.name = name;
	}
	
	
}

class FlyingBirds extends Birds
{

	public FlyingBirds(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void fly()
	{
		System.out.println(name+" is flying bird");
	}
	

}

class NonFlyingbirds extends Birds
{
	public NonFlyingbirds(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void nonFly()
	{
		System.out.println(name+" is not a flying bird");
	}

}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingBirds flyBird = new FlyingBirds("Parrot");
		flyBird.fly();
		
		NonFlyingbirds nonFlyBird = new NonFlyingbirds("Ostrich");
		nonFlyBird.nonFly();
		
	}

}
