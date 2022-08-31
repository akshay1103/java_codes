package com.InheritanceAndAbstraction;
import java.util.Date;

abstract class Medicine {
	float price;
	Date date;
	public void getDetails() {
		System.out.println(price);
		System.out.println(date);
	}
	abstract void displayLabel();;

}
