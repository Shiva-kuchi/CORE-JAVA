package com.evergent.corejava.exceptionhandling;

class InvalidScoreException extends Exception
{
	public InvalidScoreException(String message)
	{
		super(message);
	}
}
public class UserDefinedUncheckedException {

	public static void validate(int score) throws InvalidScoreException
	{
		if(score<0 || score>100)
		{
			throw new InvalidScoreException("score must be between 0 and 100");
		}
	}
	public static void main(String[] args) 
	{
		try {
			validate(110);
		}
		catch(InvalidScoreException e)
		{
		      	System.out.println("caught InvaildScoreexception :" +e.getMessage());
		      	System.out.println(e);
		}
	}

}
