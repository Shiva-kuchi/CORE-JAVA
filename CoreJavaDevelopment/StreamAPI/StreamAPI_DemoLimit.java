package com.evergent.corejava.StreamAPI;
import java.util.*;
public class StreamAPI_DemoLimit 
{
	public static void main(String[] args) 
	{
		List<Integer> mylist=Arrays.asList(1,2,3,3,4,5,6,7);
		mylist.stream().limit(4).forEach(System.out::println);
	}
}
