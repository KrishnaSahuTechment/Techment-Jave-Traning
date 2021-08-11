package com.techment.day7.collections;

import java.util.ArrayList;

public class ModifyingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("o1 = "+o1);
		
		for(int i: o1 )
		{
			if(i>2)
				o1.remove(i);
			System.out.println("o1"+o1);
				
		}
	}

}
