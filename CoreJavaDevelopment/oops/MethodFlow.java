package com.evergent.corejava.oops;

public class MethodFlow 
{
    public void display()
    {
    	System.out.println("No Arguments with no return type");
    }
    public void add(int a,int b)
    {
    	System.out.println(a+b);
    }
    public int mydata(int a,int b)
    {
    	return (a*b);
    }
    public int mychange()
    {
    	return 100;
    }
	public static void main(String[] args) 
	{
		MethodFlow mf=new MethodFlow();
		mf.display();
		mf.add(5,15);
		System.out.println(mf.mydata(5,5));
		System.out.println(mf.mychange());
	}

}
