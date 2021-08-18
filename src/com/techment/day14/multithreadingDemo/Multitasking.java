package com.techment.day14.multithreadingDemo;



class Sanika extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("sanika: "+i+"msg: welcome to banglore");
		}
		
	}

}


class Parul extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			if(i>3)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("sanika: "+i+"msg: Take vaccination");
				
			}
			
			
		}
		
	}

}

class Aman extends Thread
{
	public void run()
	{
		for(int i=1;i<=8;i++)
		{
			System.out.println("sanika: "+i+"msg: Covid19 is not yet cover");
		}
		
	}

}


public class Multitasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sanika sanika = new Sanika();
		Parul parul = new Parul();
		Aman aman = new Aman();
		
//		sanika.run();
//		parul.run();
//		aman.run();
		
		sanika.start();
		parul.start();
		aman.start();
		
	}

}
