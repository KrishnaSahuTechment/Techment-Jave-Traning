package com.techment.oopsAssignments.program3;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCard travelcard = new TravelCard(12345, 100000, 5000);
		
		System.out.println("travelcard  Balence= "+travelcard.availableBalance);
		System.out.println("travelcard swip limit = "+travelcard.swipeLimit);
		System.out.println("travelcard reward points = "+travelcard.rewardPoints);
		System.out.println("travelcard No  = "+travelcard.CardNo);
		
		travelcard.rechargeCard(60000); // 6000INR
		
		travelcard.swipeCard(40); // 40$
		

		

	}

}
