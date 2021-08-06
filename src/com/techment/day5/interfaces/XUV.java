package com.techment.day5.interfaces;

public class XUV implements Vehicle {
	@Override
	public void seatCapacity() {
		System.out.print("seat capacity is ="+4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XUV car = new XUV();
		car.seatCapacity();
		
	}
}
