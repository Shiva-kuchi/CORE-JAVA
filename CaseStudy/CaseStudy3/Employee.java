package com.evergent.corejava.HashMapCaseStudy;

public class Employee 
{
	private int id;
    private String name;
    private String department;
    
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
    public void setDepartment(String department)
    {
    	this.department=department;
    }   
    
    public String toString()
    {
    	return "\nEmployee id:"+id +"\nEmployee name:"+name +"\nEmployee Department:"+department;
    }
}

