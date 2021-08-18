package com.techment.streamAPIcasestudy.dao;
import com.techment.streamAPIcasestudy.model.*;

import java.util.List;


public interface IEmployeeDao {

	
Employee getEmployeeById(int id);
	
	List<Employee> getEmployeeByDept(String dept);
}
