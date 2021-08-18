package com.techment.test18august.program5;

import java.util.*;




public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map< Integer,Integer> hm = new HashMap< Integer,Integer>(); 
	
		hm.put(1,50); 
		hm.put(2,15); 
		hm.put(3,8); 
		hm.put(4,25); 
		
		System.out.println("hm :"+hm);
		
		Election election = new Election ();
		
		List Eligible = election.voterList(hm);
		
		System.out.println("Eligible :"+Eligible);
	
	}

	public List voterList( Map< Integer,Integer> hm )
	{
	ArrayList<Integer> aarrayId = new 	ArrayList<Integer> ();
		
		
		for (Map.Entry< Integer,Integer> e : hm.entrySet())
		{
			
			if(e.getValue()>18)
			{
				aarrayId.add(e.getKey());
				System.out.println("Id: "+e.getKey() + " Age: "+ e.getValue());
		
			}
			
		}
				
		return aarrayId;	
		
	}
	
}
