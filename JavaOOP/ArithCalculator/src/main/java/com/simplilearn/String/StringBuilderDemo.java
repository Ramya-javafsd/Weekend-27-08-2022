package com.simplilearn.String;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		String s1 = new String("Hello World ");
		StringBuilder sb = new StringBuilder(s1);
		
		sb.append("Test");
		System.out.println(sb);
		
		sb.replace(6, 11, "User");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

}
}
