package com.techment.assignmentsLogicBuild.program47;

import java.util.*;

class Product
{
	private int pid;
	private String name;
	private double price;
	
	public Product(int pid, String name, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	

	
	
	
}


class SortByName implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	

}

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(101,"Mobile",30000.0));
		products.add(new Product(102,"Soap ",50.0));
		products.add(new Product(103,"Toothpaste",100.0));
		products.add(new Product(104,"Notebook",120.0));
		products.add(new Product(105,"Colddrinks",80.0));
		
		
		
		System.out.println("products: "+products);
		
		System.out.println("\nBefore sorting by name: ");
		for(Product prod:products)
		{
			System.out.println("Pid: " + prod.getPid()+ ", Name=" + prod.getName() + ", Price=" + prod.getPrice());			
			
		}
		
		System.out.println("\nAfter sorting by name: ");
		
		Collections.sort(products, new SortByName());
		
		for(Product prod:products)
		{
			System.out.println("Pid: " + prod.getPid()+ ", Name=" + prod.getName() + ", Price=" + prod.getPrice());			
			
		}
		
	}

}

