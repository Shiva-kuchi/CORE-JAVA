package com.evergent.corejava.Strings;

public class StringBuilderExample 
{
	public static void main(String[] args) 
	{
     	  StringBuilder sb=new StringBuilder("Hello");
	      System.out.println("Initial String:" +sb);
	      sb.append("World");
	      System.out.println("After Appending:" +sb);
	      sb.insert(5, "Beautiful");
	      System.out.println("After Insertion:" +sb);
	      sb.replace(0,5,"Hi");
	      System.out.println("After replace:" +sb);
	      sb.delete(0,3);
	      System.out.println("After Deletion:" +sb);
	      sb.reverse();
	      System.out.println("After revese:" +sb);
	      System.out.println("Capacity:" +sb.capacity());
	      System.out.println("StringBuffer length:" +sb.length());
	}
}
