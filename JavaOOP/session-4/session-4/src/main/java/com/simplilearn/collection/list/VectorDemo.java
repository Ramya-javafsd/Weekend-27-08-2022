package com.simplilearn.collection.list;


import java.util.Iterator;
import java.util.List;
import java.util.Vector;



public class VectorDemo {

	
	public static void main(String[] args) {
		List<Integer> list = new Vector<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(50);
		
		
		System.out.println(list);
		
		list.remove(3);
		
		System.out.println("list aftr removing :  "+list) ;
		System.out.println("List size : "+list.size());
		System.out.println("Check if it contains 50 : "+list.contains(50));
		
		System.out.println("Display using For each loop :");
		
		for(Integer n :list)
			System.out.println(n);
		
		System.out.println("Display using Iterator: ");
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
