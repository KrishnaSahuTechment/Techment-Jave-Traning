package com.techment.day5.oops;

class Employee
{
	int id;
	String name;
	Address address; //object reference
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
}

class Address extends Employee
{
	private static Address address;
	int doorNo;
	String streetName;
	String city;
	int pincode;
	public Address(int doorNo, String streetName, String city, int pincode) {
		super(pincode, city, address);
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	public void displayEmployeeInfo() {
		// TODO Auto-generated method stub
		
	}

}

public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Address address = new Address(170,"parsada", "Durg", 490042);
		Employee employee = new Employee(1,"krishna",address);
		
		address.displayEmployeeInfo();
		
		System.out.println("id = "+employee.id);
		System.out.println("Name = "+employee.name);
		System.out.println("Door No = "+employee.address.doorNo);
		System.out.println("Street name = "+employee.address.streetName);
		System.out.println("City = "+employee.address.city);
		System.out.println("Pincode = "+employee.address.pincode);
		
	}

}
