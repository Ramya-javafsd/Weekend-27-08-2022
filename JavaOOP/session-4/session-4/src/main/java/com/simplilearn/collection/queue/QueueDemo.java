package com.simplilearn.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("Peek :  "+queue.peek());
		
		System.out.println("Poll : "+queue.poll());
		
		System.out.println("Peek after Poll : "+queue.peek());
		
		System.out.println("Display using Iterator: ");
		
		
		Iterator<Integer> it = queue.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
