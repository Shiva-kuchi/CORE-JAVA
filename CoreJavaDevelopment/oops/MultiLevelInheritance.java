package com.evergent.corejava.oops;

class PersonData
{
	public void mypersonday()
	{
	   System.out.println("persondata class");
	}
}
class PersonInfo extends PersonData
{
      public void mydetails()
      {
    	  System.out.println("personInfo class method");
      }
}
public class MultiLevelInheritance extends PersonInfo
{
    public void show()
    {
    	System.out.println("Local method");
    }
	
	public static void main(String[] args) 
	{
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.mypersonday();
		mi.mydetails();
		mi.show();

	}

}
