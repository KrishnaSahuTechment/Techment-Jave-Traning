package com.techment.day14.excercise;

public class Circle implements Shape {

	double radius;
	
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}



	@Override
	public void printDiscription() {
		// TODO Auto-generated method stub

		System.out.println("This is circle and its radius is :"+getRadius());
		System.out.println("Area of circle: "+(3.14*getRadius()*getRadius()));
	}

}
