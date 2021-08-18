package com.techment.day14.excercise;

public class Square implements Shape {

	double side;
	
	
	
	public Square(double side) {
		super();
		this.side = side;
	}



	public double getSide() {
		return side;
	}



	public void setSide(double side) {
		this.side = side;
	}



	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}



	@Override
	public void printDiscription() {
		// TODO Auto-generated method stub
		System.out.println("This is square and its side :"+getSide());
		System.out.println("Area of square: "+(getSide()*getSide()));
	}

}
