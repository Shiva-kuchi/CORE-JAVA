package com.evergent.corejava.javabeans;

public class EmployeeImpl 
{
	public static void main(String[] args) 
	{
           Employee e1=new Employee();
           e1.setEno(100);
           e1. setEname("shiva");
           e1.setSal(15000);
           
           System.out.println("employee number :" +e1.getEno());
           System.out.println("employee name :" +e1.getEname());
           System.out.println("employee salary :" +e1.getSal());      
	}

}
