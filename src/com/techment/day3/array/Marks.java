package com.techment.day3.array;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0,temp=0,count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many subjects marks you want to enter =  ");
		int number = scanner.nextInt();
		System.out.println("ok Total subject is = "+number);
		
		int marks[] = new int[number];
		
		Scanner scanMarks = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.println("Enter the marks for subject "+(i+1));
			marks[i] = scanMarks.nextInt();
		}
		
		for(int j=0;j<number;j++)
		{	System.out.println("Marks of subject "+(j+1)+" is = "+marks[j]);
			sum+=marks[j];
		}
	
		System.out.println("Sum of all subject is = "+sum);
		
		for(int m=0;m<marks.length-1;m++)
		{
			for(int k=0;k<marks.length-1;k++)
			{	if(marks[k]< marks[k+1])
				{	temp = marks[k];
					marks[k]= marks[k+1];
					marks[k+1] = temp;
				}
			}
		}
//		System.out.println("\nAfter sorting ");
//		
//		for(int l=0;l<marks.length;l++)
//		{	System.out.println("Marks of subject "+(l+1)+" is = "+marks[l]);
//			
//		}
		
		System.out.println("Highest marks = "+marks[0]);
		System.out.println("Second Highest marks = "+marks[1]);
		System.out.println("Lowest marks  = "+marks[number-1]);
		
		for(int l=0;l<marks.length;l++)
			{ if(marks[l]<40)
				count++;
			}
		
		if(count==0)
			System.out.println("Passed ");
		else
			System.out.println("Failed !! ");
		
	}
	

}
