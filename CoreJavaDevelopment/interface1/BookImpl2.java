package com.evergent.corejava.interface1;

public class BookImpl2 implements Book 
{
	public void bookTitle()
	{
		 System.out.println("Core java");
	}
    public void bookAuthor()
    {
   	 System.out.println("Oracle crop:" +cname);
    }
    public void bookPrice()
    {
   	 System.out.println("rs 550");
    }
    public void show()
    {
   	 System.out.println("local method of BookImpl class");
    }
	public static void main(String[] args) 
	{
		
			BookImpl1 book1=new BookImpl1();
			book1.bookTitle();
			book1.bookAuthor();
			book1.bookPrice();
			//book1.show();
	}
}
