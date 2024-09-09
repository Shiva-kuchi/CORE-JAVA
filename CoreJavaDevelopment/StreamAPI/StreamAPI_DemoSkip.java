package com.evergent.corejava.StreamAPI;

import java.util.*;

public class StreamAPI_DemoSkip 
{
	public static void main(String[] args) 
	{
		List<Integer> mylist=Arrays.asList(1,2,3,4,5,6,7,8);
		mylist.stream().skip(4).forEach(System.out::println);
	}
}
