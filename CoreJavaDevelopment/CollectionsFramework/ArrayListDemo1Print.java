package com.evergent.corejava.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1Print 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("shiva");
		al.add(78.9);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
