package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	
	public static void main(String[] args) {
		String regex = "(\\+91?)[987]{3}[0-9]{7}";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number  : ");
		String input = sc.next();
		
		Pattern pattern =  Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches())
			System.out.println("Pattern matched ");
		
		else 
			System.out.println("Not matched");
		
		sc.close();
		
	}
}