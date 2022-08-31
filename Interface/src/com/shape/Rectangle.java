package com.shape;

public class Rectangle implements Polygon {
	float length=50, breadth=25;
	
	public void calcArea() {
		float area = length * breadth;
		System.out.println(area);
	}
	
	public void calcPeri() {
		float peri = 2 * (length + breadth);
		System.out.println(peri);
	}
}
