package com.simplilearn.array;

public class Multi {
	
	public static void main(String[] args) {
		
		
		int a[][] = {{1,2,3},{2,3,4}};
		
		System.out.println("Direct Access : " +a[1][2]);
		System.out.println("Print using For loop : \n");
		for( int row=0; row<2; row++) {
			for (int col=0; col<3; col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("Using For each Loop :\n");
		
		for(int n[]:a) {
			for(int x:n) {
				System.out.print( x +"\t");
				
			}
			System.out.println("\n");
		}
 }
}


