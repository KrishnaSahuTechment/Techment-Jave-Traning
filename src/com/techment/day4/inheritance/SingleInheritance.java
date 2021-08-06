package com.techment.day4.inheritance;


class Doctors
{	int id;
	String name;
	int age;
	
	public Doctors(int id,String name,int age)
	{
	
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void doctorDetails(){
	System.out.println("Doctor details");
	System.out.println("Name ="+name);
	System.out.println("Id = "+id);
	System.out.println("Age = "+age);
	}
}

class Speciality extends Doctors
{
	public Speciality(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}
	String SpecialityStream;
	void specialityDetails(String SpecialityStream)
	{ this.SpecialityStream=SpecialityStream;
	System.out.println("Speciality details");
	System.out.println("Speciality = "+SpecialityStream);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speciality specialityExpert =new Speciality(1,"krishna",25);
		specialityExpert.doctorDetails();
		specialityExpert.specialityDetails("Dentist");
		System.out.println("=======================================");
		
		Speciality specialityExpert2 =new Speciality(2,"Devesh",25);
		specialityExpert2.doctorDetails();
		specialityExpert2.specialityDetails("Surgeon");
	}

}
