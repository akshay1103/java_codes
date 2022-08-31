package com.InheritanceAndAbstraction2;

abstract class PrepaidCard {
	int CardNo=1;
	double availableBalance=10000,swipeLimit=2;
	
	abstract boolean swipeCard(int amount);

	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	public void rechargeCard(int amount) {
		availableBalance=availableBalance+amount;
	}
}
