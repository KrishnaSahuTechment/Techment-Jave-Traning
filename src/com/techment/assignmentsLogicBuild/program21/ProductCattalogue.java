//Program number 21

package com.techment.assignmentsLogicBuild.program21;

import java.util.ArrayList;
import java.util.Scanner;

//import com.techment.day8.collections.Product;

class Products {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Products(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product Details  \nid= " + id + "\nname= " + name + "\nprice= " + price + "\nquantity= " + quantity+"\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}





public class ProductCattalogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		ArrayList<Products> prodList = new ArrayList<Products>();
		prodList.add(new Products(1,"Iphone",80000,5));
		prodList.add(new Products(2,"Oneplus",40000,15));
		prodList.add(new Products(3,"OPPO earphones",200,3));
		prodList.add(new Products(4,"Vivo",30000,50));
		prodList.add(new Products(5,"charger",300,50));
		
		System.out.println("\n=============Showing all products =========");
		for(Products products :prodList)
		{
			System.out.println(products);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter product id for search  =  ");
		int numberSearch = scanner.nextInt();
		
		for(Products products :prodList)
		{	
			if(products.getId()==numberSearch)
			System.out.println(products);
			else
				count++;
		}
		
		if(count!=0) {
			System.out.println("Products not found");

		}
	}

}
