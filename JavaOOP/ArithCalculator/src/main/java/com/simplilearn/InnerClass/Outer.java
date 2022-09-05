package com.simplilearn.InnerClass;

public class Outer {
	
	private int num=10;
	
	
	class Inner {
		int innervariable = 30;
		
		void display() {
			
			System.out.println("Inner class Display called ");
			System.out.println("Display : "+innervariable);
			System.out.println("Can access outer class variables "+num);
		}
	
	
	class Depth{
		
		void print() {
			System.out.println("Depth class print called");
		}
	}
	}
	public static void main(String[] args) {
		// first create obj of the outer class 
		Outer outer = new Outer();
		
		// Now create a inner class obj
		
		Outer.Inner  inner =  outer.new Inner();
		
		inner.display();
		
		// create obj of depth class which is inner class on Inner 
		Outer.Inner.Depth depth = inner. new Depth();
		depth.print();
	}

}
