package com.evergent.corejava.exceptionhandling;
/*
All exceptions are executed while abnormal conditions
Normal flow it won’t execute any exception
Once any exceptions are occurring in java then remaining lines of code are unreachable.
 */
public class ExceptionDemo2 
{
	String name="null";
    public void myData()
    {
    	try 
    	{
    		  System.out.println("one");
    		  System.out.println(name.length());
    		  System.out.println("two");
    	}
    	catch(NullPointerException e)
    	{
    		 System.out.println("I can handle:" +e);
    	}
    }
	public static void main(String[] args) 
	{	    
         ExceptionDemo2 ed=new ExceptionDemo2();
         ed.myData();
         
	}
}
