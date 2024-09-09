package com.evergent.corejava.CollectionsFramework;

import java.util.*;
public class CF_7_VectorDemo {

	public static void main(String[] args) 
	{
       Vector r=new Vector();
       r.add("hello");
       r.add(100);
       r.add(45.5);
       System.out.println(r);
       Enumeration e=r.elements();
       while(e.hasMoreElements())
       {
    	   System.out.println(e.nextElement());
       }
	}
}
