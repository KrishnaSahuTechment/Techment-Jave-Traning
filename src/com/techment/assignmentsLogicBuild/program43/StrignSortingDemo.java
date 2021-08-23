package com.techment.assignmentsLogicBuild.program43;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StrignSortingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 InputStreamReader r=new InputStreamReader(System.in);    
		 BufferedReader br=new BufferedReader(r);  
				
		System.out.print("Enter any sentence: ");
		String name =br.readLine(); 
				
		ArrayList<String> sentance = new ArrayList<String>();
				
		String[] line = name.split(" ");
				
		for(String a: line)
		{
			sentance.add(a);
		}
		
		System.out.println("sentance: "+sentance);				
		Collections.sort(sentance);
		System.out.println(" after sorting sentance: "+sentance);
	}

}
