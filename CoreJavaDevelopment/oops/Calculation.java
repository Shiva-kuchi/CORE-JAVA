package com.evergent.corejava.oops;

public class Calculation 
{     
	int a=10,b=20,c=0;
	public void addition()
	{
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		 Calculation c=new Calculation();
		 c.addition();
	}

}
