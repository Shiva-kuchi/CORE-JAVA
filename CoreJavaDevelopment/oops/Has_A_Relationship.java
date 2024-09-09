package com.evergent.corejava.oops;

public class Has_A_Relationship 
{
    public void show()
    {
    	System.out.println("show method");
    }
	public static void main(String[] args) 
	{
		Has_A_Relationship has=new Has_A_Relationship();
		has.show();
		Person p=new Person();
		p.display();
	}
}
