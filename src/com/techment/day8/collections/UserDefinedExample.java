package com.techment.day8.collections;
import java.util.*;
class Employee implements Comparable<Employee>
{
	int id ;
	String name;
	String dept;
	int age;
	
	
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.age==o.age)
			return 0;
		else if (this.age>o.age)
			return 1;
		return -1;
	}
	

}

public class UserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1," Ram","hr",34));
		employees.add(new Employee(2," Krishna","Manager",26));
		employees.add(new Employee(3," Shiva","hr",30));
		employees.add(new Employee(4," Mahesh","hr",31));
		employees.add(new Employee(5," Anmol","developer",24));
	
		System.out.println(" employess ="+employees.toString());
		
		System.out.println("=======Before sorting ==========");
		for (Employee emp:employees)
		{
			
			System.out.println(" id =  "+emp.id+" name ="+emp.name+" dept= "+emp.dept+" " +"age=" + emp.age);
		}
		
		System.out.println("=======After sorting ==========");
		Collections.sort(employees);
		for (Employee emp:employees)
		{
			
			System.out.println(" id =  "+emp.id+" name ="+emp.name+" dept= "+emp.dept+" " +"age=" + emp.age);
		}
		
	}

}
