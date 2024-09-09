package com.evergent.corejava.java_8;

interface Person3b
{
	public void eat(String foodname);
}
public class LambaDemo3b 
{
   public static void main(String args[])
   {
	   Person3b p3=(String foodname)->
	   {
		   {
			   System.out.println("I am Drinking:"+foodname);
		   }
	   };
	   p3.eat("milk");
   }
}
