package com.evergent.corejava.exceptionhandling;
//We should follow exception hierarchical
public class ExceptionDemo4 
{
    String name="null";
    int k=2;
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
	   catch(Exception x)
	   {
		  System.out.println("Using parent class: Exception" +x);   
	   }
	}
	public static void main(String[] args) 
	{
		ExceptionDemo4 ed4=new ExceptionDemo4();
		ed4.myData();
	}
}
