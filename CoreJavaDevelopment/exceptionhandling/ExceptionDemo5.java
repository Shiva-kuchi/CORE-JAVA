package com.evergent.corejava.exceptionhandling;
//m)Finally block, is executed if exception occurs or not
public class ExceptionDemo5 
{
	 String name=null;
	    int k=0;
		public void myData(){
		 try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("End");
		   }
		   catch(NullPointerException e){
			  System.out.println("I can handle: " +e);   
		   }
		   catch(ArithmeticException a){
			  System.out.println("I can also handle: " +a);   
		   }
		   catch(Exception x){
			  System.out.println("Using parent class: Exception" +x);   
		   }
		   finally{
			   System.out.println("finally block is excuted");
		   }
		}
		public static void main(String[] args) 
		{
			ExceptionDemo5 ed5=new ExceptionDemo5();
			ed5.myData();
		}
}
