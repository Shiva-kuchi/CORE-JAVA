package com.evergent.corejava.exceptionhandling;

public class StackOverFlowExample 
{
	public static void main(String[] args) 
	{
		try
		{
			recursiveMethod();
		}
		catch(StackOverflowError e)
		{
			System.out.println("Stack over flow caught ");
		}
	}
	public static void recursiveMethod()
	{
		recursiveMethod();
	}
}