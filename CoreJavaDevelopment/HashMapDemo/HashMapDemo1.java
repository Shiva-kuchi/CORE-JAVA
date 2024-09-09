package com.evergent.corejava.HashMapDemo;
import java.util.*;
public class HashMapDemo1 
{
   public static void main(String args[])
   {
	   HashMap mymap=new HashMap();
	   mymap.put(100, "ramesh");
	   mymap.put(200, "bhanu");
	   mymap.put(300, "abhi");
	   mymap.put(100,"welcome");
	   mymap.put(null, "abc");
	   mymap.put(null,"xyz");
	   System.out.println(mymap);
   }
}
