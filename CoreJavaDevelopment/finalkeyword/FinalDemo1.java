package com.evergent.corejava.finalkeyword;

public class FinalDemo1 
{
	String ename="India";//if we declare ename variable as final then at line 8 compilation error
	public void mydata()
	{
		System.out.println(ename);
	}
	public static void main(String[] args) 
	{
      FinalDemo1 f1=new FinalDemo1();
      f1.mydata();
	}
}
