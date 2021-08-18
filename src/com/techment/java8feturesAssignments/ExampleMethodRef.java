package com.techment.java8feturesAssignments;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class ExampleMethodRef {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
    	ExampleMethodRef obj = new ExampleMethodRef();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}


