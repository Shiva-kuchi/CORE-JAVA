package com.evergent.corejava.Strings;

public class RemoveSpaces 
{
	public static void main(String[] args) 
	{
        String str="Hello world,this is a test";
        String nospace=str.replace(" ","");//replace method
        System.out.println(nospace);
	}
}
