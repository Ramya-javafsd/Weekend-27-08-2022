package com.simplilearn.collection.set;



import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<>();
		
		set.add("john");
		set.add("alex");
		set.add("jack");
		set.add("catty");
		set.add("john");
		
		
		System.out.println(set);
		set.remove("jack");
		
		System.out.println("After removal : "+set);
		//try contains method,use iterator , print size of set 
		
		
		SortedSet<String> desc = ((TreeSet<String>) set).descendingSet();	
		
		System.out.println("Tree in Descending order : "+desc);
	}
	
	

}
