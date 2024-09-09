package com.evergent.corejava.java_8;
import java.util.*;
public class LambaDemo7Reference 
{
	public static void main(String[] args) 
	{
		List<String> names=new ArrayList<>();
		names.add("shiva");
		names.add("sai");
		names.add("hameed");
		names.add("rahul");
		
		System.out.println("Printing using advanced for-loop");
		for(String name:names)
		{
			System.out.println(name);
		}
        System.out.println("Printing using java-8 stream");
        names.forEach(name->System.out.println(name));
        System.out.println("printing using references ::");
        names.forEach(System.out::println);
	}

}
