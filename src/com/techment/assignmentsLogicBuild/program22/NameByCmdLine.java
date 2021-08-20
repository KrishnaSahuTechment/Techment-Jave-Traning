/*program 22
 * 
 *  */

package com.techment.assignmentsLogicBuild.program22;

import java.util.*;

public class NameByCmdLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		ArrayList<String> nameList = new ArrayList<String>();
	
		for(int i=0;i<args.length;i++)
		{		
			 nameList.add(args[i]);		
		}
		System.out.println("Before sorting:");
		System.out.println("Names: "+nameList);
		
		Collections.sort(nameList);
		System.out.println("After sorting:");
		System.out.println("Names: "+nameList);
	}

}
