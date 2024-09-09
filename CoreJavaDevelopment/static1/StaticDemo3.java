package com.evergent.corejava.static1;

public class StaticDemo3 
{
	static String cname="India";
	String name="Ravi";
	public static void mydata()
	{
	   System.out.println("mydata");	
	}
	public void myshow()
	{
		System.out.println("my show non-static method");
	}
	public static void main(String[] args) 
	{
        System.out.println(cname);
        mydata();
	}
}
