package com.evergent.corejava.StudentBeans;

public class StudentService 
{
   public int addService(int id,String name,String dept,int marks)
   {
	  String grade;
      if(marks<=300)
      {
    	  grade="C";
      }
      else if(marks<=600)
      {
    	  grade="B";
      }
      else
      {
    	   grade="A";
      }
      
	  StudentDOA std=new StudentDOA();
	  StudentBean studentbean=new StudentBean();
	  studentbean.setId(id);
	  studentbean.setName(name);
	  studentbean.setDepartment(dept);
	  studentbean.setMarks(marks);
	  studentbean.setGrade(grade);
	  
	  int update=std.addStudent(studentbean);
	  return update;
   }
}
