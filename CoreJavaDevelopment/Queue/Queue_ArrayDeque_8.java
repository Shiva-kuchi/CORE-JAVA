package com.evergent.corejava.Queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque_8 
{
   public static void main(String args[])
   {
	   ArrayDeque<String> pq=new ArrayDeque<>();
	   pq.add("Banana");
	   pq.addFirst("pipleapple");
	   pq.add("water mealon");
	   pq.add("apple");
	   pq.addFirst("kiwi");
	   pq.addLast("papaya");
	   System.out.println(pq);
	   System.out.println(pq.peek());
	   System.out.println(pq.peekFirst());
	   System.out.println(pq.peekLast());
   }
}
