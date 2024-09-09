package com.evergent.corejava.LogicalProgramming;

import java.util.Scanner;

public class LogicalProgramming1 {

	public static void main(String[] args) 
	{
         int first=0,second=1,next=0;
         Scanner input=new Scanner(System.in);
         int n=input.nextInt();
         for(int i=1;i<=n;i++)
         {
        	 System.out.print(first+" ");
        	 next=first+second;
        	 first=second;
        	 second=next;
         }
         input.close();
	}
}
