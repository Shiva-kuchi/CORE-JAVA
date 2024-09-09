package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfBoundException 
{
	public static void main(String[] args) 
	{
            int num[]=new int[5];
            try
            {
            	System.out.println(num[10]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
            	System.out.println("Error :" +e.getMessage());
            }
	 }
}

