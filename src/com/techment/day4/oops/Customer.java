package com.techment.day4.oops;

public class Customer {
	int id;
	String name;
	String contact;
	double minBalence;
	
	Customer(int id,String name,String contact){
		this.id=id;
		this.name=name;
		this.contact=contact;
		System.out.println("==================================== ");
		System.out.println("Customer ID = "+id);
		System.out.println("Customer name= "+name);
		System.out.println("Contact number= "+contact);
	}
	
	public void accountType(int minBalence){
		this. minBalence = minBalence;
		
		if(minBalence==0)
			System.out.println("this is Zero balence account");
		else if (minBalence==1000)
			System.out.println("this is Savings account");
		else if (minBalence==10000)
			System.out.println("this is Current account");
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer(1,"krishna","9522222892");
		customer1.accountType(0);
		Customer customer2 = new Customer(2,"Sunil","9533333892");
		customer2.accountType(1000);
		Customer customer3 = new Customer(3,"aman","9544444892");
		customer3.accountType(10000);
		
		
	
	}

}
