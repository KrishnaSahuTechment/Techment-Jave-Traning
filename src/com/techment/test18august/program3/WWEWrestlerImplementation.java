package com.techment.test18august.program3;

import com.techment.test18august.program3.WWE;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class WWEWrestlerImplementation  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<WWE> wrestlers = new ArrayList<WWE>();
		
		wrestlers.add(new WWE("Krishna","Sahu",275));
		wrestlers.add(new WWE("Aman","Sahu",265));
		wrestlers.add(new WWE("Anmol","Verma",278));
		wrestlers.add(new WWE("Prateek","Lodhi",95));
		wrestlers.add(new WWE("Devesh","Sahu",55));
		
		System.out.println("wrestlers: "+wrestlers);
		
		long totalWrestler = wrestlers.stream().count();
		
		System.out.println("Total Wrestler : "+totalWrestler);
		
	long weightTotal = wrestlers.stream().filter(w->w.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		
		System.out.println(" Weight Total of wrestler which weight is >200"+ weightTotal);
	
	
	 WWEWrestlerImplementation wwe1 = new  WWEWrestlerImplementation();

	 System.out.println("================================================");
	 System.out.println("First name of  wrestlers: ");
	  wwe1.printFirstName(wrestlers);
	  
	  System.out.println("================================================");
	
	  wwe1.minWeights(wrestlers);
	
	}
	
	public void printFirstName(ArrayList<WWE> wrestlers) 
 {
		/*
		 * Description: this method is return first name
		 * method name: printFirstName
		 * @param: wrestlers
		 * return: void
		 * @author: Krishna
		 * Created Date: 18/08/2021
		 *  
		 * */	
		wrestlers.stream().map(w->w.firstName).forEach(System.out::println);
	 
	 
 }
	
	public void minWeights(ArrayList<WWE> wrestlers)
	{
		
		WWE minWeight =   wrestlers.stream().min((w1,w2)->(w1.getWeight())>(w2.getWeight()) ? 1:-1).get();
		System.out.println("Min Weight: "+minWeight);
	}
	
	
}
