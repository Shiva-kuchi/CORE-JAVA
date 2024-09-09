package com.evergent.corejava.Constructor;

public class Employee2 
{
     int eno;
     String ename;
     double esal;
     
     Employee2()
     {
    	System.out.println("Default constructor"); 
     }
     Employee2(int eno,String ename,double esal)
     {
    	 this.eno=eno;
    	 this.ename=ename;
    	 this.esal=esal;
     }
     public void display()
     {
    	 System.out.println("Empolyee no:"+eno);
    	 System.out.println("Empolyee Name:"+ename);
    	 System.out.println("Empolyee salary:"+esal);
     }
	
	public static void main(String[] args) 
	{
		new Employee2();
		Employee2 e1=new Employee2(123,"shiva",25000);
		e1.display();
	}
}
