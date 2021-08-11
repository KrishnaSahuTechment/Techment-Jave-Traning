package com.techment.oopsAssignments.program3;

public abstract class PrepaidCard {

	int CardNo;
	double availableBalance;
	double swipeLimit;
	
	
	
	
	public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		CardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}

	abstract boolean swipeCard(double amount);
	
	@Override
	public String toString() {
		return String.format("card No ="+CardNo,"\navailableBalance =  "+availableBalance,"\n swipeLimit = "+swipeLimit );
		
	}
	
	void rechargeCard(double amount) 
	{
		availableBalance=availableBalance+amount;
		System.out.println(" after recharge travel card balence = "+availableBalance);
	}
	
	
}

interface Rewardable
{
	double calculatingRewardPoints(double amount);
}

class TravelCard extends  PrepaidCard implements Rewardable
{
	
	public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	int rewardPoints;

	@Override
	boolean swipeCard(double doller) {
		// TODO Auto-generated method stub
				
		double rupees  = doller*60;
		System.out.println("\nswap amount after converting rupees ="+rupees);
		
		if(rupees>this.swipeLimit)
		{System.out.println("\nSorry swipe amount is higher then swipe limit "+this.swipeLimit);
		return false;
		}
		else
		{	double processingCharge =(rupees/100)*5;
			System.out.println("from your account "+rupees+ " INR is debited and processingCharge is  "+processingCharge+"INR");
			this.availableBalance = this.availableBalance-(rupees+processingCharge);
		System.out.println("after swipe card available balence "+this.availableBalance+"INR");
		calculatingRewardPoints(rupees);
		return true;
		}
		
	}

	@Override
	public double calculatingRewardPoints(double INR) {
		// TODO Auto-generated method stub
		
		if(INR>100)
		{
			this.rewardPoints=  (int) ((int)  5*(INR/100));
			System.out.println("Reward points = "+rewardPoints);
		}
				
		return 0;
	}
	

}

