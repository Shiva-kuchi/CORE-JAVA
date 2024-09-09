package com.evergent.corejava.Constructor;

public class Employee1 
{
	int eno;
	String ename;
	double esal;
	
	Employee1()
	{
		System.out.println("Default constructor");
	}
	
	 Employee1(int no,String name,double sal)
    {
    	eno=no;
    	ename=name;
    	esal=sal;
    }
	 public void display()
	 {
		 System.out.println("Empolyee No:"+eno);
		 System.out.println("Empolyee Name:"+ename);
		 System.out.println("Empolyee salary:"+esal);
	 }
	public static void main(String[] args) 
	{
	     	new Employee1();
	     	Employee1 e1=new Employee1(123,"shiva",15000);
	     	e1.display();
	}

}
