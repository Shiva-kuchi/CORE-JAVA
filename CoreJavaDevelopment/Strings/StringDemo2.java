package com.evergent.corejava.Strings;

public class StringDemo2 {

	public static void main(String[] args) 
	{
        String str1="java";//string litral
        String str2="java";
        
        if(str1==str2)
        {
     	   System.out.println("Checking with operator:True");
        }
        else
        {
     	   System.out.println("Checking with Operator:False");
        }
        
    	    if(str1.equals(str2))
    	    {
    	    	System.out.println("Checking with equals Object method:True");
    	    }
    	    else
    	    {
    	    	System.out.println("Checking with equals object method:False");
    	    }
	}

}
