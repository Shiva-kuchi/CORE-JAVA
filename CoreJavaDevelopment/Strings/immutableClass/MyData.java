package com.evergent.corejava.Strings.immutableClass;

public class MyData 
{
	public static void main(String[] args) 
	{
		ImmutableString s=new ImmutableString("Hello,String world");
		System.out.println(s);
		System.out.println(s.myvalue());
	}
}
