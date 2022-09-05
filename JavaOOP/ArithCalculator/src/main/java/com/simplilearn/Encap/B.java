package com.simplilearn.Encap;

public class B extends A {
	
	public B() {
		super(10);
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		
		
		B b = new B();
		b.print();
	}

}
