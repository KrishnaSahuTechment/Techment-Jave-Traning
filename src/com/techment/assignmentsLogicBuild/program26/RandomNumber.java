//Program number 26
package com.techment.assignmentsLogicBuild.program26;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int randomIntNumber = random.nextInt(100);
		int randomIntNumber2 = random.nextInt(100);
		
		System.out.println("Random number 1 = "+randomIntNumber );
		System.out.println("Random number 2 = "+randomIntNumber2 );
		
		if(randomIntNumber==randomIntNumber2)
			System.out.println("Random numbers are same");
		else
			System.out.println("Random numbers are not same");

	}

}
