package com.evergent.corejava.exceptionhandling;
//p)Try followed by either catch or finally block
public class ExceptionDemo6 
{
	    String name="null";
		public void myData()
		{
		  try 
		  {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("End");
		   }
		   finally
		   {
			   System.out.println("finally block is excuted");
		   }
		}
		public static void main(String[] args) 
		{
			ExceptionDemo6 ed6=new ExceptionDemo6();
			ed6.myData();
		}
}
