package com.techment.day7.collections;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj = new ArrayList();
		System.out.println(" size before adding elements = "+obj.size());
		obj.add(1);
		obj.add("krishna");
		obj.add(25.6);
		
		System.out.println(" size after adding elements = "+obj.size());
		System.out.println(" object  = "+obj);
	
		obj.add(1, "hello");
		
		System.out.println(" size after adding elements in first index = "+obj.size());
		System.out.println(" object  = "+obj);
	
		obj.remove(1);
		System.out.println(" size remove first index value = "+obj.size());
		System.out.println(" elements in the arrayLIst after removing   = "+obj);
	
		obj.remove(Integer.valueOf(2));
		System.out.println(" size remove first index value = "+obj.size());
		System.out.println(" elements in the arrayLIst after removing   = "+obj);

		System.out.println("element "+obj.get(2));
	}

}
