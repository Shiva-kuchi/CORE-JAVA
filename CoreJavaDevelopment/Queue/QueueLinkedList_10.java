package com.evergent.corejava.Queue;
import java.util.*;
public class QueueLinkedList_10 
{
	public static void main(String[] args) 
	{
		Deque<String> q1=new LinkedList<>(); 
         q1.add("ravi");
         q1.add("bhanu");
         System.out.println(q1);
         System.out.println(q1.poll());
	}
}
