package com.evergent.corejava.Strings;

public class StringPerformance 
{
	public static void main(String[] args) 
	{
       System.out.println('a'+'b');
       System.out.println('a'+3);
       
       System.out.println("2nd part");
       System.out.println((char)('a'+3));
       System.out.println("a"+"b"+"c");
       
       System.out.println("3rd part");
       String series="";
       for(int i=0;i<26;i++)
       {
    	   char ch=((char)('a'+i));
    	   series=series+ch+" ";
       }
       System.out.println(series);
       
       System.out.println("4th part");
       StringBuilder builder=new StringBuilder();
       for(int i=0;i<26;i++)
       {
    	   char ch=((char)('a'+i));
    	   builder.append(ch+" ");
       }
       System.out.println(builder);
	}
}
