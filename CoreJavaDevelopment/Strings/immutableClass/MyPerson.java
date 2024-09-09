package com.evergent.corejava.Strings.immutableClass;

class person
{
	String name;
	int age;
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "name:" +name +  "  Age:" +age;
	}
}
public class MyPerson 
{

	public static void main(String[] args) 
	{
         person p1=new person("shiva",123);
         System.out.println(p1);
	}

}
