package com.evergent.corejava.static1;

public class Person6 
{
	 String name="Raju";//keep static
	int age=28;
	String address="Hyderabad";
	
	public void display()
	{
		name="welcome";
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Address:" +address);
	}
	public static void main(String[] args) 
	{
		Person6 p1=new Person6();
		System.out.println(p1.name);
		p1.display();
		Person6 p2=new Person6();
		System.out.println(p2.name);
		p2.display();
	}
}
