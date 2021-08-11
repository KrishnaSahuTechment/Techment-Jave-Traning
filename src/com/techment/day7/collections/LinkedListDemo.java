package com.techment.day7.collections;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList o1 = new LinkedList();
		o1.add(10);
		o1.add(50);
		o1.add(101);
		o1.addLast(200);
		o1.add(4);
		o1.addFirst(300);
		
		System.out.println("Linked List : "+o1);
		o1.removeLast();
		
		System.out.println("Linked List : "+o1);
	}

}
