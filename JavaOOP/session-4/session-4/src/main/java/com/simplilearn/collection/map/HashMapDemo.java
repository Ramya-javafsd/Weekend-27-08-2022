package com.simplilearn.collection.map;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<Integer , String> map = new HashMap<>();
		
		map.put(1,"jack");
		map.put(5,"john");
		map.put(2,"bob");
		map.put(3,"alex");
		
		
		System.out.println(map);
		System.out.println("Contians key 5 ? "+map.containsKey(5));
		System.out.println("Get value of key 1 : "+map.get(1));
		
		System.out.println("Iterate using For each loop :");
		for(Map.Entry<Integer, String> entry :map.entrySet())
		{
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
		System.out.println("Iterate using Iterator : ");
		
		Iterator<Map.Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	
	
}
