package com.techment.day5.oops;


class Car{
	
	String name;
	String model;
	Engine engine;
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	
	
}

class Engine
{
	int engineId;
	String engineType;
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	

}

public class HasRelationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine engine = new Engine(1,"6498cc");
		Car car = new Car("Lamborghini", "Aventador",engine);
		
		System.out.println("Name = "+car.name);
		System.out.println("Model = "+car.model);
		System.out.println("Engine Id = "+car.engine.engineId);
		System.out.println("Engine type = "+car.engine.engineType);
		
	}

}
