package com.evergent.corejava.Constructor;
class Empolyee
{
	Empolyee()
	{
		System.out.println("No-argument of parent class");
	}
	Empolyee(int eno)
	{
		System.out.println("The number is:" +eno);
	}
}
public class Employee5 extends Empolyee
{
	 String name;
	 int sal;
	 Employee5()
	 {
		 System.out.println("No-argument constructor");
	 }
	 Employee5(int eno,String name,int sal)
	 {
		 super(eno);
		 this.name=name;
		 this.sal=sal;
	 }
	 public void display()
	 {
		 System.out.println("Name is:" +name);
		 System.out.println("Salary is:" +sal);
	 }
	public static void main(String[] args) 
	{
		new Employee5();
	    Employee5 e5=new Employee5(123,"shiva",15000);
	    e5.display();
	}
}
