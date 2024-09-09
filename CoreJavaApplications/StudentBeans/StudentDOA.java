package com.evergent.corejava.StudentBeans;
import java.util.*;
public class StudentDOA 
{
   public int addStudent(StudentBean s)
   {
	  try
	  {
		   ArrayList mylist=new ArrayList();
		   mylist.add(s.getId());
		   mylist.add(s.getName());
		   mylist.add(s.getDepartment());
		   mylist.add(s.getMarks());
		   System.out.println(mylist);
		   
		   System.out.println("Student ID:"+s.getId());
		   System.out.println("Student Name:"+s.getName());
		   System.out.println("Student Department:"+s.getDepartment());
		   System.out.println("Student Marks:"+s.getMarks());
		   System.out.println("student Grade:"+s.getGrade());
		   
	   return 1;
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
		  return 0;
	  }
   }
}
