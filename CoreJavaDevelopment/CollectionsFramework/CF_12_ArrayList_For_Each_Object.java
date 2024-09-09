package com.evergent.corejava.CollectionsFramework;
import java.util.*;
public class CF_12_ArrayList_For_Each_Object 
{
    public static void main(String args[])
    {
    	ArrayList<Object> mylist=new ArrayList<>();
    	mylist.add(100);
    	mylist.add("shiva");
    	mylist.add("ramesh");
    	mylist.add(45.5);
    	for(Object o:mylist)
    	{
    		System.out.println(o);
    	}
    }
}
