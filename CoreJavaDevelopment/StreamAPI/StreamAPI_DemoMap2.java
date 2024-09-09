package com.evergent.corejava.StreamAPI;
import java.util.*;
public class StreamAPI_DemoMap2 
{
	public static void main(String[] args) 
	{
        List<String> mylist=Arrays.asList("shiva","sai","rahul","hameed","Rakesh");
        mylist.stream().map(str->str.length()).forEach(System.out::println);
	}
}
