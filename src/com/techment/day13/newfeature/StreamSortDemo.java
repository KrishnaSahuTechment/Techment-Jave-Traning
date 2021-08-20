package com.techment.day13.newfeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*;

import com.techment.day12.newfeature.Employee;


class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		else
			return -1;
	}
	
}



public class StreamSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Krishna","Hr",50000,18));
		employees.add(new Employee(2,"Aman","Developer",30000,20));
		employees.add(new Employee(3,"Jasmine","Tester",40000,38));
		employees.add(new Employee(4,"Rahul","Developer",25000,27));
		employees.add(new Employee(5,"Mohit","Hr",15000,30));
		employees.add(new Employee(6,"Anju","Developer",20000,38));
		employees.add(new Employee(7,"Priya","Tester",40000,38));
		employees.add(new Employee(8,"Harsha","Tester",40000,38));
		
		employees.forEach(System.out::println);
		
		System.out.println("===========================================================================");
		System.out.println("After sorting:");
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		
		System.out.println("===========================================================================");
		System.out.println("After  Age sorting:");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("===========================================================================");
		System.out.println("After reversed Age sorting:");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);
		
		
		System.out.println("===========================================================================");
		System.out.println("By using comparator Age sorting:");
		List<Employee> emp =	employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	
		emp.forEach(System.out::println);
		
		
		System.out.println("===========================================================================");
		System.out.println("salary 20%:");
			
		employees.stream().map(e->" name: "+e.getName()+" Salary: "+e.getSalary()+" Salary increased by 20% : "+(e.getSalary()+e.getSalary()*0.20)).forEach(System.out::println);
	
		System.out.println("===========================================================================");
		System.out.println("name of employees salary 20%:");
		
		List<String> li = employees.stream().map(e->"name: "+e.getName()+e.getSalary()+" Salary increased by 20% "+(e.getSalary()+e.getSalary()*0.20)).collect(Collectors.toList());
 
		
		System.out.println("li: "+li);
		
		StreamSortDemo Streamdemo = new StreamSortDemo();
		double hrsummary = Streamdemo.deptWiseSumSalary(employees,"Developer");
		System.out.println("Total salary :"+hrsummary);
		
		
		System.out.println("===========================================================================");
		System.out.println("Details of employees department wise");
		System.out.println("===========================================================================");
		System.out.println("Details of employees HR department ");
		Streamdemo.deptWiseDetails(employees, "Hr");
		System.out.println("===========================================================================");
		System.out.println("Details of employees Developer department ");
		Streamdemo.deptWiseDetails(employees, "Developer");
		System.out.println("===========================================================================");
		System.out.println("Details of employees Tester department ");
		Streamdemo.deptWiseDetails(employees, "Tester");
		
		
		System.out.println("===========================================================================");
		System.out.println("Max salary among employees");
		Streamdemo.maxSalaryOfEmployee(employees);
		
		System.out.println("===========================================================================");
		System.out.println("Max salary among employees department Developer");
		Streamdemo.maxSalaryOfDeptWise(employees,"Tester");
		
		System.out.println("===========================================================================");
		System.out.println("Min salary among employees department Hr");
		Streamdemo.minSalaryOfDeptWise(employees,"Hr");
		
	}
	
	
	
	double deptWiseSumSalary(ArrayList<Employee> employees, String dept)
	{
		/*
		 * Description: this method is to find sum salary of department 
		 * method name: deptWiseSumSalary
		 * @param: employees
		 * @param: dept
		 * return: void
		 * @author: Krishna
		 * Created Date: 17/08/2021
		 *  
		 * */	
	double sumSalary = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();	
	return sumSalary;
	}
	
	
	
	void deptWiseDetails(ArrayList<Employee> employees, String dept)
	{
		/*
		 * Description: this method is to find details department wise
		 * method name: deptWiseDetails
		 * @param: employees
		 * @param: dept
		 * return: void
		 * @author: Krishna
		 * Created Date: 17/08/2021
		 *  
		 * */
		 employees.stream().filter(e->e.getDept().equals(dept)).forEach(System.out::println);			
	}
	
	void maxSalaryOfEmployee(ArrayList<Employee> employees)
	{
		/*
		 * Description: this method is to find Maximum salary among all Employees
		 * method name: maxSalaryOfEmployee
		 * @param: employees
		 * return: void
		 * @author: Krishna
		 * Created Date: 17/08/2021
		 *  
		 * */
		Employee maxSalary =   employees.stream().max((e1,e2)->(e1.getSalary())>(e2.getSalary()) ? 1:-1).get();
		
		System.out.println("maxSalary:"+maxSalary.getSalary());
		System.out.println("Id: "+maxSalary.getId()+" Name: "+maxSalary.getName()+" Dept: "+maxSalary.getDept()+" Salary :"+maxSalary.getSalary()+" Age: "+maxSalary.getAge());		
	}
	
	
	
	void maxSalaryOfDeptWise(ArrayList<Employee> employees, String dept)
	{
		/*
		 * Description: this method is to find Maximum salary among  Employees departmentwise Developer
		 * method name: maxSalaryOfDeptWise
		 * @param: employees
		 * @param: dept
		 * return: void
		 * @author: Krishna
		 * Created Date: 17/08/2021
		 *  
		 * */
		
		List<Employee> listEmp  = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
				
		Employee maxSalary =   listEmp .stream().max((e1,e2)->(e1.getSalary())>(e2.getSalary()) ? 1:-1).get();
				
		System.out.println("maxSalary:"+maxSalary.getSalary());
		System.out.println("Id: "+maxSalary.getId()+" Name: "+maxSalary.getName()+" Dept: "+maxSalary.getDept()+" Salary :"+maxSalary.getSalary()+" Age: "+maxSalary.getAge());			
	}
	void minSalaryOfDeptWise(ArrayList<Employee> employees, String dept)
	{
		/*
		 * Description: this method is to find Mini salary among  Employees departmentwise Hr
		 * method name: minSalaryOfDeptWise
		 * @param: employees
		 * @param: dept
		 * return: void
		 * @author: Krishna
		 * Created Date: 17/08/2021
		 *  
		 * */
		
		List<Employee> listEmp  = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
				
		Employee minSalary =   listEmp .stream().min((e1,e2)->(e1.getSalary())>(e2.getSalary()) ? 1:-1).get();
				
		System.out.println("minSalary:"+minSalary.getSalary());
		System.out.println("Id: "+minSalary.getId()+" Name: "+minSalary.getName()+" Dept: "+minSalary.getDept()+" Salary :"+minSalary.getSalary()+" Age: "+minSalary.getAge());			
	}

}
