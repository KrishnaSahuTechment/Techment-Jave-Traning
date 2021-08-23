package com.techment.assignmentsLogicBuild.program41;

import java.util.Stack;

public class StackImplemtaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> stack= new Stack<>();  
			
		
		stack.push(2);
		stack.push(5);
		stack.push(7);
		stack.push(8);
		stack.push(3);
		
		System.out.println("stack: "+stack.size());
		stack.setSize(5);
		System.out.println("stack: "+stack.size());
		
		System.out.println("stack: "+stack);
		
		try {
		System.out.println("Item poped is "+stack.pop());
		System.out.println("Item poped is "+stack.pop());
		System.out.println("Item poped is "+stack.pop());
		System.out.println("Item poped is "+stack.pop());
		System.out.println("Item poped is "+stack.pop());
		
		stack.pop();
		}catch(Exception e)
		{
			System.out.println("caught exception is: "+e);
		}
	}

}
