package com.techment.test11august.program3;



class InvalidLengthException extends Exception
{
	String msg;

	public InvalidLengthException(String msg) {
		super();
		this.msg = msg;
	}
	
}

class Employee
{
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	void  validate() throws InvalidLengthException
	{
		
		String fname =getFirstName();
		String lname = getLastName();
		
		if(fname != null && lname != null)
		{
			if(fname.length()<3 ||lname.length()<3 ) {
				throw new InvalidLengthException("name should be minimum 3 characters");
			}
			else 
				System.out.println("full name = "+getFirstName()+" "+getLastName());
		}	
		else
			throw new NullPointerException("Invalid entry ");
			
		
		
	}
	
}


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee("Krishna","Sahu");
		Employee employee2 = new Employee("om","ok");
		Employee employee3 = new Employee(null,null);
		
		try {
			
		employee1.validate();
		employee2.validate();
		employee3.validate();
		
		}catch(NullPointerException e) 
		{
		System.out.println("Entry missing "+e);	
			
		}catch(InvalidLengthException e1) 
		{
			System.out.println("name should be minimum 3 characters");
		}
	}

}
