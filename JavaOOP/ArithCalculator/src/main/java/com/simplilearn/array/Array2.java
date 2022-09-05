package com.simplilearn.array;

import java.util.Scanner;

public class Array2 {
	
	public static void main(String[] args) {
		 
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			
			System.out.println("Enter the " +(i+1) +"st" + " number :");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Lets print the number :");
		
		for(int n:a) {
			System.out.println(n);
		}
	}

}
