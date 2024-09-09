package com.evergent.corejava.Queue;
import java.util.*;
public class Queue_ArrayDeque_6 {

	public static void main(String[] args) 
	{
       ArrayDeque<String> pq=new ArrayDeque();
       pq.add("ravi");
       pq.add("bahnu");
       pq.add("shankar");
       pq.add("chandu");
       System.out.println(pq);
       System.out.println(pq.peek());
	}
}
