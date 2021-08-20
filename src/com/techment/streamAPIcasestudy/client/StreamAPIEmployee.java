package com.techment.streamAPIcasestudy.client;

import java.util.stream.Collectors;

import com.techment.streamAPIcasestudy.model.Department;
import com.techment.streamAPIcasestudy.model.Employee;

import java.time.LocalDate;
import java.util.*;

public class StreamAPIEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Department department = new Department(11,"HR",100);
		Department department2 = new Department(12,"QA",101);
		Department department3 = new Department(13,"Developer",102);
		Department department4 = new Department(14,"Telecall",102);
		
		LocalDate date = LocalDate.now(); 
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		
		employees.add(new Employee(1,"Krishna","Sahu","kishn@gmail.com","9522222892",date,20000,"HR",100,26,department));
		employees.add(new Employee(2,"Aman","Yadav","aman@gmail.com","9522222891",date,10000,"QA",101,26,department2));
		employees.add(new Employee(3,"Karan","Verma","karan@gmail.com","9522222893",date,30000,"Developer",102,26,department3));
		employees.add(new Employee(4,"Preteek","Pandey","prateek@gmail.com","9522222894",date,40000,"HR",100,26,department));
		employees.add(new Employee(5,"Devesh","Manipuri","devesh@gmail.com","9522222895",date,60000,"QA",101,26,department2));
		employees.add(new Employee(6,"Sagar","Sahu","sagar@gmail.com","9522222897",date,80000,"Developer",102,26,department3));
		employees.add(new Employee(7,"Sameer","Sahu","sameer@gmail.com","9522222897",date,80000,"Developer",102,26,null));
		employees.add(new Employee(8,"Sonu","Sahu","sonu@gmail.com","9522222897",date,80000,"Developer",102,26,null));
		employees.add(new Employee(9,"Mahesh","Sahu","Mahesh@gmail.com","9522222897",date,80000,"Developer",102,26,null));
//		employees.add(new Employee(8,"Monu","Sahu","monu@gmail.com","9522222897",date,80000,"Developer",102,26,department4));
//		employees.add(new Employee(9,"Vikram","Sahu","sagar@gmail.com","9522222897",date,80000,"Developer",102,26,department4);
		
		System.out.println("employees: "+employees);
		
		StreamAPIEmployee StreamAPIEmp = new StreamAPIEmployee();
		StreamAPIEmp.sumSalary(employees);
		
		
		System.out.println("==========================================================================================================");
		
		StreamAPIEmp.filterByDept(employees,"HR");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		StreamAPIEmp.filterByDept(employees,"Developer");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		StreamAPIEmp.filterByDept(employees,"QA");		
		
		System.out.println("==========================================================================================================");
		StreamAPIEmp.salaryIncresedBy15(employees);		
		System.out.println("==========================================================================================================");
		StreamAPIEmp.filterWithoutDept(employees);		
		System.out.println("==========================================================================================================");
//		StreamAPIEmp.findDepartmentWithoutEmp(department4)
		System.out.println("==========================================================================================================");
		
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
		/*
		 * Description: this method is to filter employees by department. 
		 * method name: sumSalary
		 * @param: employees
		 * return: void
		 * @author: Krishna
		 * Created Date: 19/08/2021
		 *  
		 * */	
		try {
		
		System.out.println("Department "+dept);
		
		empList.stream().filter(e->e.getDepartment().getDepartmentName().equals(dept)).forEach(e->System.out.println("name:  "+e.getFirstName()+" "+e.getLastName()+" Designation: "+e.getDesignation()));
		
		Long deveCount = empList.stream().filter(e->e.getDepartment().getDepartmentName().equals(dept)).count();
		System.out.println("Total "+dept+": "+deveCount);
		}catch(Exception e)
		{
			System.out.println("caught: "+e);
		}
	}
	
	
	public void salaryIncresedBy15(ArrayList<Employee> employees) 
	{
		/*
		 * Description: this method is  Increased salary By 15% employees. 
		 * method name:salaryIncresedBy15
		 * @param: employees
		 * return: void
		 * @author: Krishna
		 * Created Date: 19/08/2021
		 *  
		 * */	
		System.out.println("salary 15%:");
		
		employees.stream().map(e->" name: "+e.getFirstName()+" "+e.getLastName()+" Salary: "+e.getSalary()+" Salary increased by 15% : "+(e.getSalary()+e.getSalary()*0.15)).forEach(System.out::println);
	
		
	}
	
	public void filterWithoutDept (ArrayList<Employee> empList)
	{			
		/*
		 * Description: this method is to filter employees which has no department. 
		 * method name: filterWithoutDept
		 * @param: employees
		 * return: void
		 * @author: Krishna
		 * Created Date: 19/08/2021
		 *  
		 * */	

		try {
		System.out.println(" Employees without department ");
		
		empList.stream().filter(e->e.getDepartment()==null).forEach(e->System.out.println("name:  "+e.getFirstName()+" "+e.getLastName()+" Designation: "+e.getDesignation()));
		}catch(Exception ex)
		{						
			System.out.println("caught: "+ex);
		}
				
	}

	
	
	
	
	
	

}
