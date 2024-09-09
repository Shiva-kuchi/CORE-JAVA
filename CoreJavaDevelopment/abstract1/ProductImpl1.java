package com.evergent.corejava.abstract1;

public class ProductImpl1 extends Product
{
	public void newproduct()
	{
		System.out.println("My new Product");
	}
	public void show()
	{
		System.out.println("Local method");
	}
	public static void main(String[] args) 
	{
		ProductImpl1 p1=new ProductImpl1();
		p1.newproduct();
		p1.allproduct();
		p1.show();
	}
}
