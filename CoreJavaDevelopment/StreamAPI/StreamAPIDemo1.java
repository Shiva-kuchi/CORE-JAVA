package com.evergent.corejava.StreamAPI;

import java.util.*;

public class StreamAPIDemo1 
{
	public static void main(String[] args) 
	{
		List<Integer> mylist=Arrays.asList(1,2,3,4,5,6);
		mylist.stream().forEach(System.out::println);
	}
}
