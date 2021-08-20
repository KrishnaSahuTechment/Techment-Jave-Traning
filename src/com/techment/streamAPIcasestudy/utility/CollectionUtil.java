package com.techment.streamAPIcasestudy.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.techment.streamAPIcasestudy.model.Department;
import com.techment.streamAPIcasestudy.model.Employee;

public class CollectionUtil {

	static  Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
	
	static
	{
		
		Department department = new Department(11,"HR",100);
		Department department2 = new Department(12,"Security",101);
		Department department3 = new Department(13,"Develpoer",102);
		
		LocalDate date = LocalDate.now(); 
		
		
		
		employees.put(1,new Employee(1,"Krishna","Sahu","kishn@gmail.com","9522222892",date,20000,"HR",100,26,department));
		employees.put(2,new Employee(2,"Aman","Yadav","aman@gmail.com","9522222891",date,10000,"QA",101,26,department2));
		employees.put(3,new Employee(3,"Karan","Verma","karan@gmail.com","9522222893",date,30000,"Developer",102,26,department3));
		employees.put(4,new Employee(4,"Preteek","Pandey","prateek@gmail.com","9522222894",date,40000,"HR",100,26,department));
		employees.put(5,new Employee(5,"Devesh","Manipuri","devesh@gmail.com","9522222895",date,60000,"QA",101,26,department2));
		employees.put(6,new Employee(6,"Sagar","Sahu","sagar@gmail.com","9522222897",date,80000,"Developer",102,26,department3));
			
		
	}
	
	public static Map<Integer,Employee>  getEmployeeList()
	{
		return employees;
	}
	
}
