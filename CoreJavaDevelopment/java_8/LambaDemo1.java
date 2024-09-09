package com.evergent.corejava.java_8;
import java.util.*;
interface Person1
{
	public void eat();
}
public class LambaDemo1 
{
	public static void main(String[] args) 
	{
        Person1 p1=new Person1()
               {
        	      public void eat()
        	      {
        	    	  System.out.println("eating...!");
        	      }
        	   }; 
             p1.eat();
	}
}
