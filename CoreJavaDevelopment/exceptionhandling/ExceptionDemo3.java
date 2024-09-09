package com.evergent.corejava.exceptionhandling;
//There is two exceptions in class,developer should be 
//handle 1st exception then after 2nd exception will be handled.
public class ExceptionDemo3 
{
     String name=null;
     int k=0;
	public void myData()
	{
	 try {
		System.out.println("one");
		System.out.println(name.length());
		int t=10/k;
		System.out.println(t);
		System.out.println("End");
	   }
	   catch(NullPointerException e)
	   {
		  System.out.println("I can handle: " +e);   
	   }
	   catch(ArithmeticException a)
	   {
		  System.out.println("I can also handle: " +a);   
	   }
	}
	public static void main(String[] args) 
	{
		ExceptionDemo3 ed3=new ExceptionDemo3();
		ed3.myData();
	}

}
