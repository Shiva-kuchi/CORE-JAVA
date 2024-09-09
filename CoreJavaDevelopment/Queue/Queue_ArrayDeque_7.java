package com.evergent.corejava.Queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque_7 
{
	public static void main(String[] args) {
		ArrayDeque<String> pq=new ArrayDeque();
	       pq.add("ravi");
	       pq.add("bahnu");
	       pq.add("shankar");
	       pq.add("chandu");
	       pq.addFirst("shiva");
	       pq.addLast("sai");
	       System.out.println(pq);
	       System.out.println(pq.peek());
	       System.out.println(pq.size());
	}
}
