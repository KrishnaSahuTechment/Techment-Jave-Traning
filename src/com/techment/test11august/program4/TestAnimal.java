package com.techment.test11august.program4;

abstract class Animal
{

	abstract void shout();
	
}

class Dogs extends Animal 
{

	@Override
	void shout() {
		// TODO Auto-generated method stub
		System.out.println("Dogs are barks");
	}
	
}

class Cat extends Animal
{

	@Override
	void shout() {
		// TODO Auto-generated method stub
		System.out.println("cats meaow meaow");
	}
	
}

class Lion extends Animal
{

	@Override
	void shout() {
		// TODO Auto-generated method stub
		System.out.println("lion roars");
	}
	
}

public class TestAnimal 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Dogs();
		dog.shout();
		
		Animal cat = new Cat();
		cat.shout();

		Animal lion = new Lion();
		lion.shout();

		
		
	}

}
