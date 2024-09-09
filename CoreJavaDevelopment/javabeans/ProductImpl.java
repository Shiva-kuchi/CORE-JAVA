package com.evergent.corejava.javabeans;

public class ProductImpl 
{
	public static void main(String[] args) 
	{
          Product p1=new Product(100,"laptop",50000);
          System.out.println("product Number: " +p1.getPno());
          System.out.println("product Name: " +p1.getPname());
          System.out.println("product Price: " +p1.getPrice());
	}

}
