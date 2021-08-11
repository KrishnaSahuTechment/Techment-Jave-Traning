package com.techment.oopsAssignments.program5;
import java.util.Random;


abstract class Medicine
{
	double price;
	String  expiryDate;
	
	
	
	public Medicine(double price, String expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}

	abstract void displayLabel();
		
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	void getDetails()
	{
		System.out.println("Price = "+this.price);
		System.out.println("Expiry date = "+this.expiryDate);
		
	}
}

class  Tablet extends Medicine
{

	public Tablet(double price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Tablets  need to store in a dry place");
	}
	
}

class Syrup extends Medicine
{

	public Syrup(double price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Syrup needs to  Protect from direct sun rays lights");
	}
	
}

class Ointment extends Medicine
{

	public Ointment(double price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Ointment are only for external use only");
	}
	
}


public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Medicine[ ] objectArrayReference;
		Medicine[ ] MedicineObjectArrayReference = new Medicine[5];
		
		MedicineObjectArrayReference[0] = new Tablet(1000,"01/01/2021");
		MedicineObjectArrayReference[1] = new Syrup(2000,"02/02/2022");
		MedicineObjectArrayReference[2] = new Ointment(3000,"03/03/2023");
		MedicineObjectArrayReference[3] = new Tablet(4000,"04/04/2024");
		MedicineObjectArrayReference[4] = new Syrup(5000,"05/05/2025");
		
		
		Random random = new Random();
		
		int n = random.nextInt(3);
		System.out.println("n = "+n);
		MedicineObjectArrayReference[n].displayLabel();
		MedicineObjectArrayReference[n].getDetails();
		
	}

}
