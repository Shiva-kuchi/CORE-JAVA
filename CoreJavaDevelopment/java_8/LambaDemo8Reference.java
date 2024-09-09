package com.evergent.corejava.java_8;
import java.util.*;
import java.util.Arrays;

public class LambaDemo8Reference 
{
	public static void main(String[] args) 
	{
        List<Integer> mylist=Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("using advanced for-loop");
        for(Integer i:mylist)
        {
        	System.out.println(i);
        }
        System.out.println("using steams java 8");
        mylist.forEach(num->System.out.println(num));
        System.out.println("printing using references ::");
        mylist.forEach(System.out::println);
	}
}
