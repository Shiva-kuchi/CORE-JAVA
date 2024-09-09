package com.evergent.corejava.static1;

public class StaticDemo5 
{
	 static //static block
     {
   	   System.out.println("Static block :open db/network");
     }
	 public static void mydata()
	 {
		 System.out.println("MyData");
	 }
	public static void main(String[] args) 
	{
		StaticDemo5.mydata();
		
	}
}
