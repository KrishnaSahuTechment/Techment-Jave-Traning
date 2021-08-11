package com.techment.day6.CustomeException;


class LateException extends Exception
{
	String msg;

	public LateException(String msg) {
		super();
		this.msg = msg;
	}
	
	

}

class Student
{
	
	void login(int time) throws LateException
	{
		if (time>9)
		throw new LateException(null);
		else
			System.out.println("On time");
	}
	
}


public class CustomeCheckedExceptionDeom {

	public static void main(String[] args) throws LateException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.login(8);
	}

}
