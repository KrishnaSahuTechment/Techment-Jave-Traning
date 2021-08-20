package com.techment.assignmentsLogicBuild.program24;

import java.util.*;

class Question
{
private	int id;
private String name;
private String option1;
private String option2;
private String option3;
private String option4;
private int correctAns;

@Override
public String toString() {
	return "Question [id=" + id + ", name=" + name + ", option1=" + option1 + ", option2=" + option2 + ", option3="
			+ option3 + ", option4=" + option4 + ", correctAns=" + correctAns + "]";
}


public Question() {
	super();
	// TODO Auto-generated constructor stub
}


public Question(int id, String name, String option1, String option2, String option3, String option4,
		int correctAns) {
	super();
	this.id = id;
	this.name = name;
	this.option1 = option1;
	this.option2 = option2;
	this.option3 = option3;
	this.option4 = option4;
	this.correctAns = correctAns;
}



public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getOption1() {
	return option1;
}


public void setOption1(String option1) {
	this.option1 = option1;
}


public String getOption2() {
	return option2;
}


public void setOption2(String option2) {
	this.option2 = option2;
}


public String getOption3() {
	return option3;
}


public void setOption3(String option3) {
	this.option3 = option3;
}


public String getOption4() {
	return option4;
}


public void setOption4(String option4) {
	this.option4 = option4;
}


public int getCorrectAns() {
	return correctAns;
}


public void setCorrectAns(int correctAns) {
	this.correctAns = correctAns;
}






}


public class QuizeGame {

	

	public static void main(String[] args) {
		
		Question questions = new Question();
		
		Map<Integer,Question> hmQuestions = new HashMap<Integer,Question>();
		
		hmQuestions.put(1, new Question(1,"Which of the following is not a Java features?","1.Dynamic","2.Architecture Neutral","3.Use of pointers","4.Object-oriented",3));
		hmQuestions.put(2, new Question(2,"What is the return type of the hashCode() method in the Object class?","1.Object","2.int","3.long","4.void",2));
		hmQuestions.put(3, new Question(3," An interface with no fields or methods is known as a ______.?","1.Runnable Interface","2.Marker Interface","3.Abstract Interface","4.CharSequence Interface",2));
		
//		System.out.println("hmQuestions: "+hmQuestions);
		
		Scanner scanQuestionNum = new Scanner(System.in);
		
		System.out.println("Enter question number from 1 to 3: ");
		int Qnum = scanQuestionNum.nextInt(); 
		
		QuizeGame quize = new QuizeGame();
		quize.displayQuestion(hmQuestions,Qnum);
		
		
		
	}
	
	 void displayQuestion(Map<Integer,Question> hmQuestions,int questionNo)
	 {
	 	
		 for(Map.Entry<Integer, Question> entryQues:hmQuestions.entrySet())
		 {
		 
			 
			 
		 	if(entryQues.getKey()==questionNo)
		 	{
		 		System.out.println(entryQues.getValue().getName()+" \n"+entryQues.getValue().getOption1()+" \n"+entryQues.getValue().getOption2()+" \n"+entryQues.getValue().getOption3()+" \n"+entryQues.getValue().getOption4()+" \n");
		 		
		 		Scanner scanAns = new Scanner(System.in);
		 		System.out.println("Enter  correct option nummber: ");
				int ans = scanAns.nextInt(); 
				
				if(ans>4||ans<0)
				{
					System.out.println("enter option number from 1 to 4");
				}
				else
				{
					if(entryQues.getValue().getCorrectAns()==ans)
					{
						System.out.println("yes it is correct answer ");
					}
					else
					{
						
						System.out.println("Sorry wrong answer ");
						int answer = entryQues.getValue().getCorrectAns();
						
						int op1 = Character.getNumericValue(entryQues.getValue().getOption1().charAt(0));
						int op2 = Character.getNumericValue(entryQues.getValue().getOption2().charAt(0));
						int op3 = Character.getNumericValue(entryQues.getValue().getOption3().charAt(0));
						int op4 = Character.getNumericValue(entryQues.getValue().getOption4().charAt(0));
						
						System.out.println("op1"+op1);
						System.out.println("op2"+op2);
						System.out.println("op3"+op3);
						System.out.println("op4"+op4);
						if(op1==answer )
						{
						System.out.println("Correct answer is: "+entryQues.getValue().getOption1());
						}
						else if(op2==answer )
						{
						System.out.println("Correct answer is: "+entryQues.getValue().getOption2());
						}
						else if(op3==answer )
						{
						System.out.println("Correct answer is: "+entryQues.getValue().getOption3());
						}
						else if(op4==answer )
						{
						System.out.println("Correct answer is: "+entryQues.getValue().getOption4());
						}
						else
						{
							System.out.println("please enter the correct number");
						}
					}
				}	
		 	}
		 	else
		 	{
		 		System.out.println("Please choose question number from 1 to 3");
		 	}
		 }
	 }

}
