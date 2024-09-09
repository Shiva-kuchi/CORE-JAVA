package com.evergent.corejava.Strings;

public class SplitDemo1 
{
	public static void main(String[] args) 
	{
        String str="Java is powerful programming language";
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++)
        {
        	System.out.println(words[i]);
        }
	}
}
