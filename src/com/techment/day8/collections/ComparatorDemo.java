package com.techment.day8.collections;

import java.util.*;
class Student
{
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

class AgeSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age==o1.age)
			return 0;
		else if (o1.age>o2.age)
			return 1;
		else 
			return -1;
	}
	

}

class NameSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorDemo   //implements Comparator<Student>
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(1,"krishna",26));
		stuList.add(new Student(2,"Ramkrishna",50));
		stuList.add(new Student(5,"Shiva",25));
		
		
		for(Student student :stuList)
		{
			System.out.println(student);
		}
		
		System.out.println("==after name sorting=========");
		Collections.sort(stuList,new NameSorting());
		
		for(Student student :stuList)
		{
			System.out.println(student);
		}
		
		System.out.println("==after age sorting=========");
		Collections.sort(stuList,new AgeSorting());
		
		for(Student student :stuList)
		{
			System.out.println(student);
		}
		
	}


}
