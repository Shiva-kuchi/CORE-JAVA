package com.evergent.corejava.CollectionsFramework;
import java.util.*;
public class CF_13_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		  LinkedHashSet<String> lhs=new LinkedHashSet<>();
		  lhs.add("apple");
		  lhs.add("banana");
		  lhs.add("orange");
		  lhs.add("mango");
		  lhs.add("graghs");
		  System.out.println(lhs);
		  System.out.println("we can iterate using for-each loop");
		    for(String fruits:lhs)
		    {
		    	System.out.println(fruits);
		    }
	   //containg mango checking
		    System.out.println(lhs.contains("mango"));
		    //remove the element
		    lhs.remove("banana");
		    System.out.println(lhs);
		    lhs.clear();
		    System.out.println(lhs);
	}
}
