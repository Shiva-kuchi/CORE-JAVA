package com.evergent.corejava.java_8;

interface Person2
{
	public void eat();
}
public class LambaDemo2 
{
	public static void main(String[] args) 
	{
	   Person2 p2=()->
	   {
		   {
			   System.out.println("Rich food");
		   }
	   };
	   p2.eat();
	}
}
