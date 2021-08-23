package com.techment.assignmentsLogicBuild.program25;

import java.util.Scanner;

class ChildThread extends Thread
{
	int num;
	
	
	public ChildThread(int num) {
		super();
		this.num = num;
	}


	public void run( )
	{
		
		for(int i = 1;i<=num;i++)
		{
			
			System.out.println("$");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}


class ChildThread2 extends Thread
{
	int num;
	
	
	public ChildThread2(int num) {
		super();
		this.num = num;
	}


	public void run( )
	{
		
		for(int i = 1;i<=num;i++)
		{
			
			System.out.println("*");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

public class ParallelMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number how many times you want to print *: ");
		int star = scan.nextInt();
		
		System.out.print("Enter the number how many times you want to print $: ");
		int doller = scan.nextInt();
		
		ChildThread child = new ChildThread(star);
		ChildThread2 child2 = new ChildThread2(doller);
		
		child.start();
		child2.start();
	}

}
