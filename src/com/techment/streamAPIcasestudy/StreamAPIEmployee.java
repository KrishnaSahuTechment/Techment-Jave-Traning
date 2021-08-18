package com.techment.streamAPIcasestudy;

import java.util.stream.Collectors;

import com.techment.streamAPIcasestudy.model.Department;
import com.techment.streamAPIcasestudy.model.Employee;

import java.time.LocalDate;
import java.util.*;

public class StreamAPIEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Department department = new Department(11,"HR",100);
		Department department2 = new Department(12,"Security",101);
		Department department3 = new Department(13,"Develpoer",102);
		
		LocalDate date = LocalDate.now(); 
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		
		employees.add(new Employee(1,"Krishna","Sahu","kishn@gmail.com","9522222892",date,20000,"HR",100,26,department));
		employees.add(new Employee(2,"Aman","Yadav","aman@gmail.com","9522222891",date,10000,"Security",101,26,department2));
		employees.add(new Employee(3,"Karan","Verma","karan@gmail.com","9522222893",date,30000,"Develpoer",102,26,department3));
		employees.add(new Employee(4,"Preteek","Pandey","prateek@gmail.com","9522222894",date,40000,"HR",100,26,department));
		employees.add(new Employee(5,"Devesh","Manipuri","devesh@gmail.com","9522222895",date,60000,"Security",101,26,department2));
		employees.add(new Employee(6,"Sagar","Sahu","sagar@gmail.com","9522222897",date,80000,"Develpoer",102,26,department3));
		
		
		System.out.println("employees: "+employees);
		
		StreamAPIEmployee StreamAPIEmp = new StreamAPIEmployee();
		StreamAPIEmp.sumSalary(employees);
		
		
		System.out.println("==========================================================================================================");
		
		StreamAPIEmp.filterByDept(employees,"HR");
		
		System.out.println("==========================================================================================================");
		
		
	}
			
	public void sumSalary(ArrayList<Employee> employees) 
	{	
		/*
		 * Description: this method is to find sum of salary of all employees. 
		 * method name: sumSalary
		 * @param: employees
		 * return: void
		 * @author: Krishna
		 * Created Date: 18/08/2021
		 *  
		 * */	
		
		double sumSalaries =  employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		System.out.println("Total  Salary: "+sumSalaries);
	}
	
	public void filterByDept (ArrayList<Employee> empList,String dept)
	{			
		System.out.println("empList "+empList); 
		System.out.println("dept "+dept);
		
		empList.stream().filter(e->e.getDepartment().equals(dept)).forEach(e->System.out.println("name:  "+e.getFirstName()+" "+e.getLastName()));
		
		Long deveCount = empList.stream().filter(e->e.getDepartment().equals(dept)).count();
		System.out.println("Total developer: "+deveCount);
				
	}

}
