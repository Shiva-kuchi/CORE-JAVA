package com.evergent.corejava.java_8;
interface Names
{
	public void names(String name);
}
public class LambaDemo9 
{
   public static void main(String args[])
   {
	   Names n1=(String name)->
	   {
		   {
			   System.out.println("Name is:"+name);
		   }
	   };
	   n1.names("Shiva");
   }
}
