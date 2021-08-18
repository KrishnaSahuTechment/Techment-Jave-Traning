package com.techment.Assignments.ExceptionsAssignments.Program1;

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		try {
			
			if(args[0]==null||args[1]==null)
				System.out.println("No input received");
			else {				
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
			
				
				System.out.println("num1 ="+num1);
				System.out.println("num2 ="+num2);
				
		
			int divide = num1/num2;
				
			System.out.println("Division =  "+divide);
			
			}
		}catch(NullPointerException e)
        {
            System.out.print("No Input received Caught:"+e);
        }catch (NumberFormatException e)
        {
            System.out.println("Only integers are allowed caught:"+e);
        }catch(ArithmeticException e)
		{ 	System.out.println("Division with zero is not possible caught :"+e);
					
		}catch(Exception e) 
		{
			System.out.println(e);
		}
	}

}
