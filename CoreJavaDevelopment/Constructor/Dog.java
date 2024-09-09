package com.evergent.corejava.Constructor;

class Animal 
{
	private String name;
	private int age;
	
	public Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("The name is:" +name);
		System.out.println("The age is:" +age);
	}
}
public class Dog extends Animal
{
	private String breed;
	public Dog(String name,int age,String breed)
	{
		super(name,age);
		this.breed=breed;
	}
	public void display()
	{
		super.display();
		System.out.println("Breed is:" +breed);
	}
	public static void main(String[] args) 
	{
		Dog d=new Dog("Buddy",5,"Golden retriever");
		d.display();
		
	}

}
