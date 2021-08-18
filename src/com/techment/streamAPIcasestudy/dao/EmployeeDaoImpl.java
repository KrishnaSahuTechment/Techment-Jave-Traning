package com.techment.streamAPIcasestudy.dao;

import com.techment.streamAPIcasestudy.model.Employee;
import com.techment.streamAPIcasestudy.utility.CollectionUtil;

import java.util.*;

public class EmployeeDaoImpl implements IEmployeeDao {

	CollectionUtil collectionUtil = new CollectionUtil();
	
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Map<Integer,Employee> empMap = 	CollectionUtil.getEmployeeList();
		Employee employee = empMap.get(id);
			
			return employee ;
		
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		// TODO Auto-generated method stubList<Employee> employeeList = new ArrayList<Employee>();
		

		List<Employee> employeeList = new ArrayList<Employee>();
		
		Map<Integer,Employee> empMap = CollectionUtil.getEmployeeList();
		
		for(Employee employee : empMap.values())
		{
			if(employee.getDepartment().equals(dept))
			{
				employeeList.add(employee);
			}
			
		}
		
		return employeeList;
	}

}


//if(employee.getDepartment().equalsIgnoreCase(dept))