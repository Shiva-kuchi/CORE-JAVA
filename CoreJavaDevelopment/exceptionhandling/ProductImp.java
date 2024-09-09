package com.evergent.corejava.exceptionhandling;

class ProductNotFoundException extends Exception 
{
    public ProductNotFoundException(String msg)
    {
    	System.out.println("Hello" +msg);
    }
}
public class ProductImp 
{
	int pno=105;
	public void myData() throws ProductNotFoundException
	{
		if(pno>100)
		{
			throw new ProductNotFoundException("There is no product");
		}
		else
		{
			System.out.println("There is product");
		}
	}
	public static void main(String[] args) 
	{
          try
          {
        	  ProductImp p1=new ProductImp();
        	  p1.myData();
          }
          catch(ProductNotFoundException e)
          {
        	  System.out.println(e);
          }
	}

}
