package com.evergent.corejava.java_8;
import java.util.*;
public class LamdaDemo6forEach 
{
	public static void main(String[] args) 
	{
		List<String> games=new ArrayList<>();
		games.add("cricket");
		games.add("football");
		games.add("basket ball");
		games.add("hockey");
		
		for(String s:games)
		{
			System.out.println(s);
		}
		System.out.println("printing streams java-8");
		//using streams
		games.forEach(g->System.out.println(g));
	}
}
