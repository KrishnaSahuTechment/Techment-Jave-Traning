package com.techment.day8.collections;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		
		hm.put(1, "krishna");
		hm.put(2, "Anmol");
		hm.put(4, "Prateek");
		hm.put(3, "Devesh");
		hm.put(10, 2000);
		
		System.out.println("Hash map "+hm);
		
		
		
		LinkedHashMap Lhm = new LinkedHashMap();
		Lhm.put(12, "car");
		Lhm.put(2, "car");
		Lhm.put(5, 1000);
		Lhm.put(50, "car");
		Lhm.put(100, "car");
		
		System.out.println("Linked Hash map "+Lhm);
		
		
		TreeMap Tm = new TreeMap();
		Tm.put(50, "square");
		Tm.put(5, "circle");
		Tm.put(25, "rectangle");
		Tm.put(75, "polygon");
		Tm.put(15, 4000);
		
		System.out.println("Tree map "+Tm);
		
	}

}
