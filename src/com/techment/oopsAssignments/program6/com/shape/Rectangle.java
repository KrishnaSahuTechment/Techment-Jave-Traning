package com.techment.oopsAssignments.program6.com.shape;


public class Rectangle implements Polygon
{
	float length ;
	float breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle = "+(length*breadth));
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of rectangle = "+2*(length+breadth));
	}
	
}
