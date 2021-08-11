package com.techment.day7.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s1 = new Stack();
		
		s1.push(1);
		s1.add(2);
		s1.add(3);
		
		System.out.println("elements = "+s1);
		System.out.println("after peek  "+ s1.peek());
		
		s1.pop();
		System.out.println("after removig  "+ s1);
		
		
		System.out.println("after peek  "+ s1.peek());
		
		s1.pop();
		System.out.println("after pop  "+ s1);
		
	}
}
