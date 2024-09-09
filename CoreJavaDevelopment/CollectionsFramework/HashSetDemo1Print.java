package com.evergent.corejava.CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1Print 
{
	public static void main(String args[])
	{
	  HashSet h1=new HashSet();
      h1.add(100);
      h1.add("shiva");
      h1.add(105);
      h1.add(100);
      
      Iterator i=h1.iterator();
      while(i.hasNext())
      {
    	  System.out.println(i.next());
      }
	}
      
}
