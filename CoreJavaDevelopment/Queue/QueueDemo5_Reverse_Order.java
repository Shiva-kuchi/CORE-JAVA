package com.evergent.corejava.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo5_Reverse_Order 
{
	public static void main(String[] args) 
	{
	       Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
	       pq.add(8);
	       pq.add(2);
	       pq.add(5);
	       pq.add(9);
	       System.out.println(pq.peek());
	       System.out.println(pq.poll());
	       System.out.println(pq.remove());
	       pq.clear();
	       System.out.println(pq.isEmpty());
	}
}
