package com.simplilearn.Annonymous;

public class Test1 {
	
	public static void main(String[] args) {
		Car sachinscar = new Car() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
				System.out.println("Sachin's car stopping ");
				
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				
				System.out.println("Sachin's car starting ");
				
			}
		};
		sachinscar.start();
		sachinscar.stop();
		
		Car ambaniscar = new Car() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("Ambani's car stopping ");
				
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Ambani's car starting ");
			}
		};
		ambaniscar.start();
		ambaniscar.stop();
	}

}
