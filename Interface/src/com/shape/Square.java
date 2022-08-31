package com.shape;

public class Square implements Polygon{
	float side=5;
	public void calcArea() {
		float area = side * side;
		System.out.println(area);
	}
	public void calcPeri() {
		float peri = 4 * side;
		System.out.println(peri);
		
	}
}
