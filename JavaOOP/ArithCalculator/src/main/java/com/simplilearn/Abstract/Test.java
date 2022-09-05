package com.simplilearn.Abstract;

public class Test {

	
	public static void main(String[] args) {
		Shape s1 = new Circle("Red", 3.4);
		Shape s2 = new Rectangle("Green", 3.4, 5);
		
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
