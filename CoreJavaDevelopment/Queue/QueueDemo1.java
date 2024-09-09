package com.evergent.corejava.Queue;
import java.util.*;
//add,offer add an element
//remove,poll removes an element from head
//retireve peek top element 
public class QueueDemo1 
{
    public static void main(String args[])
    {
    	Queue<Integer> pq=new PriorityQueue<>();
    	pq.add(8);
    	pq.add(2);
    	pq.add(5);
    	pq.add(9);
    	System.out.println(pq);
    }
}
