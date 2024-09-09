package com.evergent.corejava.StreamAPI;

import java.util.*;

public class StreamAPI_DemoMap 
{
	public static void main(String[] args) 
	{
       List<Integer> mylist=Arrays.asList(1,2,3,4,5,6,7);
       mylist.stream().map(i->i*i).forEach(System.out::println);
	}
}
