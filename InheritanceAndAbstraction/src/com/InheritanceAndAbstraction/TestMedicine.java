package com.InheritanceAndAbstraction;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine[ ] m = new Medicine[3];
		Tablet t = new Tablet();
		Syrup s = new Syrup();
		Ointment o = new Ointment();
		m[0] = t;
		m[1] = s;
		m[2] = o;
		
		for(int i = 0; i<m.length; i++) {
	         m[i].displayLabel();
	         System.out.println(" ");
	      }

	}

}
