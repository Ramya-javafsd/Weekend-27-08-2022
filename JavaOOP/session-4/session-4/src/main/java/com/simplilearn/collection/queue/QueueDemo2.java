package com.simplilearn.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {

	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("Peek :  "+queue.peek());
		
		System.out.println("Poll : "+queue.poll());
		
		System.out.println("Peek after Poll : "+queue.peek());
	}
}
