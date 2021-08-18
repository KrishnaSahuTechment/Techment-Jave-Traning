package com.techment.day12.newfeature;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Krishna","Hr",20000,18));
		employees.add(new Employee(2,"Aman","Developer",30000,20));
		employees.add(new Employee(3,"Jasmine","Secretary",40000,38));
		employees.add(new Employee(4,"Rahul","Developer",25000,27));
		employees.add(new Employee(5,"Mohit","Hr",15000,30));
		
		employees.stream().forEach(s->System.out.println(s));
		
		//to count no of employees
		Long empcount = employees.stream().count();
		
		System.out.println("Total number of employees: "+empcount);
		
		Long deveCount = employees.stream().filter(e->e.getDept().equals("Developer")).count();
		System.out.println("Total developer: "+deveCount);
		employees.stream().filter(e->e.getDept().equals("Developer")).forEach(e->System.out.println("name of the developers "+e.getName()));
	
		List<Employee> emp = employees.stream().filter(e->e.getDept().equals("Developer")).collect(Collectors.toList());
	
		System.out.println(emp);
	
		Long numberOfEmployee = employees.stream().collect(Collectors.counting());
		System.out.println("no of employees :"+numberOfEmployee);
		
//		
//		Long totalSalary = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
//		
//		System.out.println(" total salary:"+totalSalary);
//		
//		int max = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
//		
//		System.out.println(" max salary:"+max);
		
		
		
		
		
		StreamEmployeeDemo obj = new StreamEmployeeDemo();
		List<Employee> empDepts = obj.filterByDept(employees, "Developer");
		System.out.println(empDepts);
	
		
	
	
	}
	
	List filterByDept (ArrayList<Employee> empList,String dept)
	{
		List listEmpDept = empList.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		
		System.out.println(listEmpDept);
		
		return listEmpDept;
				
	}
	
	

}
