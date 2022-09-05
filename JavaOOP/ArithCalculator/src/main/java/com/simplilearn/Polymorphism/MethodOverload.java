package com.simplilearn.Polymorphism;

public class MethodOverload {
	
	
	public int add ( int a, int b) {
		return a+b;
	}

	public double  add ( double a, double b) {
		return a+b;
	}
	
	public float add ( float a, float b) {
		return a+b;
	}
	
	public int add ( int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		MethodOverload m1= new MethodOverload();
		System.out.println("Double Addition : "+m1.add(3.4, 4.5));
		System.out.println("Float Addition : "+m1.add(3.7f, 4.6f));
		System.out.println("Int Addition : "+m1.add(3, 4));
		System.out.println(" 3 Int  Addition : "+m1.add(3,4,5));
	}



}
