package com.evergent.corejava.CollectionsFramework;

import java.util.ArrayList;

public class ArrayList_wrapperClass 
{
	public static void main(String[] args) 
	{
	  int a=10;
	  Integer il=new Integer(a);
	  ArrayList al=new ArrayList();
	  al.add(il);
	  Integer i2=new Integer(100);
	  al.add(i2);
	  al.add(new Integer(200));
	  System.out.println(al);
	}
}
