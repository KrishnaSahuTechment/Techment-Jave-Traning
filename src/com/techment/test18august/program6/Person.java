package com.techment.test18august.program6;



class AgeException extends RuntimeException  // RuntimeException
{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
}


public class Person {

	int id;
	String name;
	int age;
	
	
	
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	




	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}






	public static void main(String[] args) throws AgeException
	{
		// TODO Auto-generated method stub

		
		Person person = new Person(1,"Krishna",16);
		Person person2 = new Person(2,"Anmol",15);
		Person person3 = new Person(3,"Sohan",2);
		
		
		try{
			
			if(person3.age<3)
				throw new AgeException("age is less then 3 not eligible for voting");
			else
				System.out.println("Age :"+person3.age);
		}catch(Exception e)
		{			
			System.out.println("caught: "+e);
						
		}
		
	}

}
