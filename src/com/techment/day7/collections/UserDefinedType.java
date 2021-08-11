package com.techment.day7.collections;

import java.util.*;
public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Employee emp1 = new Employee(1,"sachine","hr");
		Employee emp2 = new Employee(2,"krishna","hr");
		
		ArrayList <Employee> employees = new ArrayList<Employee>();
	employees.add(emp1);
	employees.add(emp2);
	employees.add(new Employee(3,"aman","manager"));
	
	
	for (Employee emp : employees)
	{
		if(emp.getId()>2)
			emp.setDept("developer");
		System.out.println(emp.id+" "+emp.name+" "+emp.dept);
	}
	
	}

}
