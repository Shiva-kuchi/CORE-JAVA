package com.evergent.corejava.CollectionsFramework;

import java.util.*;
import java.util.List;
import java.util.ListIterator;

public class CF_6_ListIterator {

	public static void main(String[] args) 
	{
       List list=new ArrayList();
       list.add("ramu");
       list.add("ravi");
       list.add("balu");
       list.add("bhanu");
       list.add("shiva");
       ListIterator li=list.listIterator();
       li.add("welcome");
       while(li.hasNext())
       {
    	   String s=(String)li.next();
    	   System.out.println(s);
    	   if(s.equals("balu"))
    	   {
    		   li.remove();
    	   }
       }
       while(li.hasPrevious())
       {
    	   System.out.println(li.previous());
       }
	}
}
