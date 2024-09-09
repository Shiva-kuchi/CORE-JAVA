package com.evergent.corejava.java_8;

interface Addition
{
	public int addition(int num1,int num2);
}
public class LambaDemo5Add 
{
      public static void main(String args[])
      {
    	  Addition a1=(int num1,int num2)->
    			  {
    				  {
    					  int sum=num1+num2;
    					  //System.out.println("Addition of Two number is:"+sum);
    					  return sum;
    				  }
    			  };
    			  int result=a1.addition(5,7);
    			  System.out.println(result);
      }
}
