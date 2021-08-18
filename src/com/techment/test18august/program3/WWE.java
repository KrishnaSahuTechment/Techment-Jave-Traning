package com.techment.test18august.program3;

public class WWE {

	String firstName;
	String lastName;
	int weight ;
	
	public WWE() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
	
	
	
}
