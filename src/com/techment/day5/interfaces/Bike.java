package com.techment.day5.interfaces;

public class Bike implements Vehicle {

	@Override
	public void seatCapacity() {
		// TODO Auto-generated method stub
		System.out.println("seat capacity is  "+2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.seatCapacity();
		
	}

}
