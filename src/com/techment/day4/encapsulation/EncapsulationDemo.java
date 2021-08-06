package com.techment.day4.encapsulation;

class Employee
{
	private int id = 100;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("krishna");
		
//		emp.getId();
//		emp.getName();
		System.out.println("id = "+emp.getId()+"\nname = "+emp.getName());
		
	}

}
