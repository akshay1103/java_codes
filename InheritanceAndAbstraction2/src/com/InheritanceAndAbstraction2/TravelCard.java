package com.InheritanceAndAbstraction2;

public class TravelCard extends PrepaidCard implements Rewardable {
	
	int rewardPoints;
	
	public void rewardPoints() {
		 rewardPoints=rewardPoints+50;
	}
	
	@Override
	boolean swipeCard(int amount) {
		// TODO Auto-generated method stub
		double INR = 74.42 * amount;
		availableBalance=availableBalance-INR;
		
		if (INR>100) {
			rewardPoints();
		}
		return true;
	}

}
