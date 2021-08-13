package com.techment.day10.jdbc;

//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import com.mysql.cj.xdevapi.Statement;

import java.sql.*;

public class MysqlConnectionDemo {

	
	
	public static void main(String[] args) {
		
		try {
		
		//step1 load the driver class
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found and loaded");
		
		//step2 create the connection
//		For oracle
//		String url = "jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";  // we will change this url to connect other databases like oracle
//		String id = "root";
//		String password ="root"; 

		
//		For Mysql
		String url = "jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
		String id = "root";
		String password ="root"; 
		
		Connection con = DriverManager.getConnection(url, id, password);
	
		
//		System.out.println("con to connect Mysql = "+con);
		System.out.println("connected to my sql");
		
		
		
		
		Statement stmt = con.createStatement();
		//Statement is user for static query 
		//Prepare statement user for dynamic query it is also known as parametrized query
				
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		System.out.println("rs ="+rs);
						
		while(rs.next())
		{
			System.out.println("id = "+rs.getInt(1)+" name "+rs.getString(2)+" salary "+rs.getInt(3));
		}
			con.close();
			
		
		}catch(ClassNotFoundException e)
		{
			System.out.println("cought: "+e);
			
			
		}catch(Exception e)
		{
			System.out.println("cought: "+e);
			
			
		}
	}

}
