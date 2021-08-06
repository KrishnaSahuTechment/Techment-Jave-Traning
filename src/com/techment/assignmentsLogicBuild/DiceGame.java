//Program number 27 Dice game

package com.techment.assignmentsLogicBuild;
import java.math.*;
import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0,sub=0;
		Random random = new Random();
		int randomIntNumber = random.nextInt(6);
		int randomIntNumber2 = random.nextInt(6);
		
		System.out.println("On 1st roll dice number "+randomIntNumber+"\non 2nd roll dice number ="+randomIntNumber2);
		
		if(randomIntNumber%2==0&&randomIntNumber2%2==0)
			{sum = randomIntNumber+randomIntNumber2;
			System.out.println("Numbers are even so you score is = "+sum);
			}
		else
			{
			sub = Math.abs(randomIntNumber-randomIntNumber2);
			System.out.println("Numbers are odd so you score is = "+sub);
			}
		
	}

}
