package com.evergent.corejava.exceptionhandling;

public class MyOutOfMemory 
{
	public static void main(String[] args) throws Exception 
	{
	  Integer[] array=new Integer[1000*1000];
	  System.out.println(array);
	}
}
