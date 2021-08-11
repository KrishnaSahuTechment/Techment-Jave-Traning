package com.techment.day8.collections;

import java.util.*;

class Product {
	
	int id;
	String name;
	double price;
	int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}


class PriceSortig implements Comparator<Product> 
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		if(o1.price==o2.price)
			return 0;
		else if (o1.price>o2.price)
			return 1;
		else
			return -1;
	}
	
}

class QuantitySorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.quantity==o2.quantity)
			return 0;
		else if (o1.quantity<o2.quantity)
			return 1;
		else
			return -1;
	}
	

}

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1,"Iphone",80000,5));
		prodList.add(new Product(2,"Oneplus",40000,15));
		prodList.add(new Product(3,"OPPO earphones",200,3));
		prodList.add(new Product(4,"Vivo",30000,50));
		prodList.add(new Product(5,"charger",300,50));
		
		System.out.println("\n=============Showing all products =========");
		for(Product product :prodList)
		{
			System.out.println(product);
		}
		
		
		
		Collections.sort(prodList,new PriceSortig());
		System.out.println("\n=============after sorting  by price in ascending order =========");
		for(Product product : prodList)
		{
			System.out.println(product);
		}
		System.out.println("\n=============after sorting  by quantity in descending order =========");

		Collections.sort(prodList,new QuantitySorting());
		for(Product product : prodList)
		{
			System.out.println(product);
		}
		System.out.println("\n=============display the product which price is greater than 500 =========");
		for(Product product : prodList)
		{	
			if(product.price>500)
			System.out.println(product);
		}
		
	}

}
