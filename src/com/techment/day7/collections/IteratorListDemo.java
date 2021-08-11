package com.techment.day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		
		System.out.println("elements of o1 "+o1);
		Iterator<Integer> itr = o1.iterator();
		
		System.out.println("forward direction");
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
//		System.out.println("previous direction");
//		
//		while(itr.hasPrevious()) 
//		{
//			System.out.println(itr.previous());
//		}
		
	}

}
