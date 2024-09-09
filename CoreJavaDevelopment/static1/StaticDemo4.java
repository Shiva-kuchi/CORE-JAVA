package com.evergent.corejava.static1;

public class StaticDemo4 
{
	static String cname="India";//static variable
	String name="Ravi";
	public static void mydata()
	{
	   System.out.println("mydata");	
	}
	//non static method
	public void myshow()
	{
		mydata();
		System.out.println("my show non-static method");
	}
	public static void main(String[] args) 
	{
        System.out.println(cname);
        StaticDemo4 s1=new StaticDemo4();
        s1.myshow();
	}

}
