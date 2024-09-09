package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo8throws 
{
    String name=null;
    int k=0;
    public void myData()
    {
    	System.out.println("one");
    	System.out.println(name.length());
    	System.out.println("end");
    }
    public void myChange()
    {
    	myData();
    	System.out.println("My change method");
    }
	public static void main(String[] args) 
	{
       try
       {
    	   ExceptionDemo8throws ex2=new ExceptionDemo8throws();
    	   ex2.myChange();
       }
       catch(Exception e)
       {
    	   System.out.println("I can handle " +e);
       }
	}

}
