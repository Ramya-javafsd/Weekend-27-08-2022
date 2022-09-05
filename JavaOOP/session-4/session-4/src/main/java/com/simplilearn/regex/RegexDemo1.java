package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.*;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		
		Pattern pattern =  Pattern.compile("[a-zA-z0-9@.]*");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pattern : ");
		String input = sc.next();
		
		
		
		Matcher matcher = pattern.matcher(input);
		
		
		if(matcher.matches())
			System.out.println("Pattern matched ");
		
		else 
			System.out.println("Not matched");
		
		sc.close();
		
	}

	
	
}
