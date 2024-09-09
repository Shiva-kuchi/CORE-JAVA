package com.evergent.corejava.LogicalProgramming;
import java.util.*;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		int target=input.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			  if(target==a[i])
			  {
				  flag=true;
				  System.out.println("Index is:"+i);
				  break;
			  }
		}
		if(flag==false)
		{
			System.out.println("target element is not present the list");
		}
	}
}
