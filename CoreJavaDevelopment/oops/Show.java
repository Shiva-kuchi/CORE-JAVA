package com.evergent.corejava.oops;

public class Show extends Calculation 
{
	public void show()
	{
	    System.out.println("show method local class");	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Show s=new Show();
		s.show();
		s.addition();
	}

}
