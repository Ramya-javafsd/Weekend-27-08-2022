package com.simplilearn.InnerClass;

public class LocalInnerclass {

	
	public void display()
	{
		class Inner{
			int num = 10;
			void print() {
				System.out.println("Local inner class");
				System.out.println("value : "+num);
			}
			
		
		}
		
		Inner inner = new Inner();
		inner.print();
	}
	
	public static void main(String[] args) {
		LocalInnerclass l = new LocalInnerclass();
		l.display();
	}
}
