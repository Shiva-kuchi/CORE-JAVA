
package com.evergent.corejava.Constructor;

public class CopyConstructor 
{
	String name;
	int number;
	public CopyConstructor(String name,int number)
	{
		this.name=name;
		this.number=number;
	}
	public CopyConstructor(CopyConstructor c)
	{
		name=c.name;
		number=c.number;
	}
    public void display()
    {
    	System.out.println(name);
    	System.out.println(number);
    }
	public static void main(String[] args) 
	{
      		CopyConstructor c1=new CopyConstructor("shiva",123);
      		CopyConstructor c2=new CopyConstructor(c1);
      		c1.display();
      		c2.display();
	}

}
