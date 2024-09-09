package com.evergent.corejava.java_8;
interface Person4
{
	public void eat(String foodname1,String foodname2);
}
public class LambaDemo4 
{
	public static void main(String[] args) 
	{
	  Person4 p4=(String foodname1,String foodname2)->
	  {
		  {
			  System.out.println("Drink "+foodname1+"  with " +foodname2);
		  }
	  };
	  p4.eat("milk","sugar");
	}
}
