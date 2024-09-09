package com.evergent.corejava.StudentBeans;
import java.util.*;
public class Maincontroller 
{

	public static void main(String[] args) 
	{
        int id;
        String name;
        String dept;
        int marks;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the id:");
        id=input.nextInt();
        System.out.print("Enter the name:");
        name=input.next();
        System.out.print("Enter the department:");
        dept=input.next();
        System.out.print("Enter the marks:");
        marks=input.nextInt();
        
        
            StudentService studentservice=new StudentService();
        	int update=studentservice.addService(id, name, dept,marks);
        	System.out.print("You have successfully inserted row:"+update);
        }

}
