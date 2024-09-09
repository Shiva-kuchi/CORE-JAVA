package com.evergent.corejava.Strings.immutableClass;

public class Person1Mutable 
{

	private final String name;
	private final int age;
	public Person1Mutable(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
    public String myname()
    {
    	return name;
    }
    public int myage()
    {
    	return age;
    }
}
