package com.techment.day14.excercise;

public class Rectangle implements Shape {

	double length;
	double breadth;
	
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}



	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getBreadth() {
		return breadth;
	}



	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}



	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}



	@Override
	public void printDiscription() {
		// TODO Auto-generated method stub
		System.out.println("This is rectangle and its length is :"+getLength()+"breadth: "+getBreadth());
		System.out.println("area of rectangle :"+(getLength()*getBreadth()));
	}

}
