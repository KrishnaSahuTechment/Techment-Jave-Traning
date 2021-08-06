package com.techment.day4.inheritance;


class Animal
{
	String name;
	public	Animal(String name)
	{
		this.name=name;
	}
	
	void eating(){
		System.out.println("Name of puppy = "+this.name);
		System.out.println("Eating");	
	}

}

class Dogs extends Animal
{

	public Dogs(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	void bark()
	{
		System.out.println("barking");
	}

}

class BabyDogs extends Dogs
{

	public BabyDogs(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	void puppies()
	{
		System.out.println("this puppies is very cute");
	}

	
	
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDogs puppy1 = new BabyDogs("Floopy");
		puppy1.eating();
		puppy1.bark();
		puppy1.puppies();
	}

}


