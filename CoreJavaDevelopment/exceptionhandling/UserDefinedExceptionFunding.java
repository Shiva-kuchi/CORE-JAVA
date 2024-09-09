package com.evergent.corejava.exceptionhandling;

class InsuffientFundsException extends Exception
{
	public InsuffientFundsException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionFunding 
{

	public static void withdraw(double amount) throws InsuffientFundsException
	{
	     double balance=500;
	     if(amount>balance)
	     {
	    	 throw new InsuffientFundsException("Insuffient funds for withdrawal");
	     }
	     else
	     {
	    	 System.out.println("withdraw successfully");
	     }
	}
	public static void main(String[] args) 
	{
	 	try 
	 	{
	 		withdraw(600);
	 	}
	 	catch(InsuffientFundsException e)
	 	{
	 		System.out.println("caught Insuffient funds Exception :" +e.getMessage());
	 		System.out.println(e);
	 	}
        System.out.println("program continues after handling exception");
	}

}
