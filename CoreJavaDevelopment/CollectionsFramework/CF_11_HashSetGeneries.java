package com.evergent.corejava.CollectionsFramework;
import java.util.*;
public class CF_11_HashSetGeneries 
{
		public static void main(String args[])
		{
		//can only store single data type element
		    HashSet<Integer> mylist=new HashSet<>();
		    mylist.add(100);
		    mylist.add(80);
		    mylist.add(90);
		    mylist.add(100);
		    System.out.println(mylist);
		}
}
