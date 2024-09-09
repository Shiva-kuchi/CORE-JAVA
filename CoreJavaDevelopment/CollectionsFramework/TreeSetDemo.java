package com.evergent.corejava.CollectionsFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo 
{
   public static void main(String args[])
   {
	   TreeSet ts=new TreeSet();
	   ts.add(100);
	   ts.add(500);
	   ts.add(300);
	   ts.add(100);// doesnt allow null values
	   System.out.println(ts);
	   System.out.println("printing with Iterator");
	   Iterator i=ts.iterator();
	   while(i.hasNext())
	   {
		   System.out.println(i.next());
	   }
   }
}
