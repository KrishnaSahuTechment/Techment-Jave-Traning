package com.techment.day14.excercise;


public class ShapeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape circle = new Circle(3);
		circle.printDiscription();
		
		System.out.println("");
		Shape rectangle = new Rectangle(5,6);
		rectangle.printDiscription();
		
		System.out.println("");
		Shape square = new Square(5);
		square.printDiscription();
		
	}

}
