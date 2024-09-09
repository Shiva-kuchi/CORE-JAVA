package com.evergent.corejava.StreamAPI;

import java.util.*;

public class StreamAPI_distinctDemo 
{
	public static void main(String[] args) 
	{
        List<Integer> mylist=Arrays.asList(1,2,3,4,4,5,5,7,7,1);
        mylist.stream().distinct().forEach(System.out::println);
	}
}
