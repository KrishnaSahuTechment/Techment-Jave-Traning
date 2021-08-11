package com.techment.oopsAssignments.program6.com.shape;

public class Square implements Polygon
{
	
	 float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square = "+(side*side));
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Square = "+(4*side));
	}
	 
}
