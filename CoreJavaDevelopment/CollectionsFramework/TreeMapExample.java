package com.evergent.corejava.CollectionsFramework;
import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tmap=new TreeMap<>(); 
        tmap.put(0,null);
        tmap.put(1,"shiva");
        tmap.put(2,"sai");
        tmap.put(3,"rahul");
        tmap.put(4,"rakesh");
        for(Map.Entry<Integer,String> c:tmap.entrySet())
        {
        	System.out.println("key :"+c.getKey()+"   "+"value :"+c.getValue());
        }
	}

}
