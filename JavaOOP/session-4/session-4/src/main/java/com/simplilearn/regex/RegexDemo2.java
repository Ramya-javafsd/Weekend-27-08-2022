package com.simplilearn.regex;

import java.util.regex.*;

public class RegexDemo2 {
	
	public static void main(String[] args) {
		
		String regex = "[a-zA-z]+";
		String input = "Welcome to the world of regex ";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			
			System.out.println(input.substring(matcher.start(),matcher.end()));
	}
		
	}
}
	
	
