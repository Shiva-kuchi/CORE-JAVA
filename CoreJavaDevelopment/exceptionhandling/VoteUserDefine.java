package com.evergent.corejava.exceptionhandling;
import java.util.*;

class VoteIsNotSupport extends Exception
{
	  public VoteIsNotSupport(String msg)
	  {
		  System.out.println("Hey! " +msg);
	  }
}
public class VoteUserDefine 
{
    public void check_age(int age) throws VoteIsNotSupport
    {
    	  if(age<18)
    	  {
    		  throw new VoteIsNotSupport("You are not eligable for voting");
    	  }
    	  else
    	  {
    		  System.out.println("You are eligable for voting");
    	  }
    }
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		VoteUserDefine v1=new VoteUserDefine();
        try
        {
        	System.out.println("Enter you age");
    		int age=input.nextInt();
        	v1.check_age(age);
        }
        catch(VoteIsNotSupport v)
        {
        	System.out.println(v);
        }
	}
}
