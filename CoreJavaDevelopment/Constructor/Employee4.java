package com.evergent.corejava.Constructor;

public class Employee4 
{
	     int eno;
	     String ename;
	     double esal;
	     
	     Employee4(int eno)
	     {
	    	this.eno=eno; 
	     }
	     Employee4(int eno,String ename,double esal)
	     {
	    	 this(eno);
	    	 this.ename=ename;
	    	 this.esal=esal;
	     }
	     public void display()
	     {
	    	 System.out.println("Empolyee no:" + eno);
	    	 System.out.println("Empolyee Name:" + ename);
	    	 System.out.println("Empolyee salary:" + esal); 	
	     }
	public static void main(String[] args) 
	{
		
		Employee4 e4=new Employee4(123,"shiva",25000);
		e4. display();
	}
}
