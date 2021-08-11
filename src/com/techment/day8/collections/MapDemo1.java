package com.techment.day8.collections;

//import java.security.KeyStore.Entry;
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(1,"krishna",25);
		Student student2 = new Student(1,"krishna",25);
	
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	
	HashMap<Student ,String> hm = new HashMap<Student ,String>();
	hm.put(new Student(1,"krishna",19),"cse");
	hm.put(new Student(1,"krishna",19),"cse");
	
	for(java.util.Map.Entry<Student, String> stu:hm.entrySet())
	{
		System.out.println(stu);
	}
	
	}

}
