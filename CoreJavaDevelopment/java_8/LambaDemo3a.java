package com.evergent.corejava.java_8;

interface Person3
{
	public void eat(String name);
}
public class LambaDemo3a 
{
	public static void main(String[] args) 
	{
		Person3 p3=(String name)->
		{
			{
				System.out.print("I am eating:"+name);
			}
		};
		p3.eat("Biryani");
	}
}
