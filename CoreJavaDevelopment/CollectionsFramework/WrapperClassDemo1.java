package com.evergent.corejava.CollectionsFramework;

public class WrapperClassDemo1 
{
	public static void main(String[] args) 
	{
     int a=10;
     Integer ai=new Integer(a);//autoboxing
     System.out.println(ai);
     int il=ai.intValue();//unboxing
     System.out.println(il);
	}
}
