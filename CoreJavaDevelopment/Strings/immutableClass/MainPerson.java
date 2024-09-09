package com.evergent.corejava.Strings.immutableClass;

public class MainPerson 
{
	public static void main(String[] args) 
	{
		Person1Mutable p1=new Person1Mutable("Raju",23);
		System.out.println("Name:" +p1.myname());
		System.out.println("Age:" +p1.myage());
	}
}
