package com.evergent.corejava.LogicalProgramming;
import java.util.*;

public class Factorial 
{
	public static int fact(int n)
	{
		  if(n<=1)
		  {
			  return n;
		  }
		  return n*fact(n-1);
	}
	public static void main(String[] args) 
	{
		  Scanner input=new Scanner(System.in);
		  int n=input.nextInt();
		  int result=fact(n);
		  System.out.print(result);
		  input.close();
	}
}
