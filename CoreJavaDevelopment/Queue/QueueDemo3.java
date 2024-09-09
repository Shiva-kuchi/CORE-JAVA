package com.evergent.corejava.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo3 
{
	public static void main(String[] args) 
	{
       Queue<Integer> pq=new PriorityQueue<>();
       pq.add(8);
       pq.add(2);
       pq.add(5);
       pq.add(9);
       System.out.println(pq.peek());
       System.out.println(pq.poll());
       System.out.print(pq.remove());
	}
}
