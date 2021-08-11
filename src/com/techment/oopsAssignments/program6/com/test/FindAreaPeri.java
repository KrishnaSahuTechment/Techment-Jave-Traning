package com.techment.oopsAssignments.program6.com.test;

import  com.techment.oopsAssignments.program6.com.shape.*;

import  com.techment.oopsAssignments.program6.com.shape.Polygon;
import  com.techment.oopsAssignments.program6.com.shape.Rectangle;
import  com.techment.oopsAssignments.program6.com.shape.Square;


public class FindAreaPeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square square = new Square(4);
		square.calcArea();
		square.calcPeri();
		
		Rectangle rectangle = new Rectangle(4,5);
		rectangle.calcArea();
		rectangle.calcPeri();
	}

}
