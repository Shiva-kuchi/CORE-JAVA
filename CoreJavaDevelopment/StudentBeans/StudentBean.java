package com.evergent.corejava.StudentBeans;

public class StudentBean 
{
    int id;
    String name;
    String dept;
    int marks;
    String grade;
    
    public void setId(int id)
    {
    	this.id=id;
    }
    public int getId()
    {
    	return id;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getName()
    {
    	return name;
    }
    public void setDepartment(String dept)
    {
    	this.dept=dept;
    }
    public String getDepartment()
    {
    	return dept;
    }
    public void setMarks(int marks)
    {
    	this.marks=marks;
    }
    public int getMarks()
    {
    	return marks;
    }
    public void setGrade(String grade)
    {
    	this.grade=grade;
    }
    public String getGrade()
    {
    	return grade;
    }
}
