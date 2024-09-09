package com.evergent.corejava.finalkeyword;

class MyClass 
{
	final public void myproduct()
	{
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends MyClass 
{
	final String ename="India";
	public void myproduct1()
	{
		System.out.println("new products");
	}
	public void mydata()
	{
		System.out.println(ename);
	}
	public static void main(String args[])
	{
		FinalDemo2 f2=new FinalDemo2();
		f2.mydata();
		f2.myproduct();
	}
}
