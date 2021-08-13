package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//import com.techment.oopsAssignments.program5.Medicine;


class Employees
{
int id;
String name;
int salary;

public Employees(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}


public void addIntoDatabase()
{
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found and loaded");
		String url = "jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
		String databaseId = "root";
		String password ="root"; 
		
		Connection con = DriverManager.getConnection(url, databaseId, password);
	
		
//		System.out.println("con to connect Mysql = "+con);
//		System.out.println("connected to my sql");
		
	PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)" );
		ps.setInt(1,this.id);
		ps.setString(2,this.name);
		ps.setInt(3,this.salary);
		
		ps.execute();
		
		System.out.println("inserted");
		
	}catch(Exception e)
	{
		System.out.println("caught:"+e);
		
	}
	

	

}

}

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Enter how many employees details you want to enter = ");
		Scanner scannerNumber = new Scanner(System.in);
		int number = scannerNumber.nextInt();
		
		
		Employees[ ] employees = new Employees[number];
		
		
		for(int i=0;i<number;i++)
		{
		
				System.out.println("Enter id = ");
				Scanner scanner = new Scanner(System.in);
				int empId = scanner.nextInt();
				
				System.out.println("Enter name = ");
				Scanner scannerString = new Scanner(System.in);
				String name = scannerString.nextLine();
				
				System.out.println("Enter salary = ");
				Scanner scannerSalary = new Scanner(System.in);
				int salary = scannerSalary.nextInt();
				
				employees[i] = new Employees(empId,name,salary);
				employees[i].addIntoDatabase();
		}
		
		
	}

}
