package com.evergent.corejava.Constructor;
public class Car
{
	private String color;
	private int maxspeed;
	Car()
	{
		color="white";
		maxspeed=120;
	}
	Car(String color,int maxspeed)
	{
		this.color=color;
		this.maxspeed=maxspeed;
	}
	public void display()
	{
		System.out.println("Color is :" +color);
		System.out.println("Maxspeed is :" +maxspeed);
	}
	
	public static void main(String[] args) 
	{
		Car c1=new Car();
		Car c2=new Car("Red",150);
		c1.display();
		c2.display();

	}
}
