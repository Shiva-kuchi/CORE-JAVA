package com.evergent.corejava.generalprogramming;

import java.util.Scanner;

public class SwappingWithOutTemp 
{
	public static void main(String args[])
	{
			Scanner input=new Scanner(System.in);
		    int a=input.nextInt();
		    int b=input.nextInt();
		    //swapping without extra variable
		    a=a^b;
		    b=a^b;
		    a=a^b;
		    System.out.print(a+" "+b);
		    input.close();
	}
}
