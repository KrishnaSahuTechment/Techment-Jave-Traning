package com.techment.test11august.program2;

public class Employee {

	String firstName;
	String lastName;
	
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Krishna","sahu");
		Employee employee2 = new Employee("Ajay","Yadav");
		Employee employee3 = new Employee("Anmol","Verma");
		
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		
	}

}
