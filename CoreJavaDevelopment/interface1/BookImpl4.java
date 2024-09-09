package com.evergent.corejava.interface1;

public class BookImpl4 implements Book,NewBook2
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
    public void myNewBook()
    {
    	System.out.println("My New Book");
    }
    public void dataInfo()
    {
    	System.out.println("my new data info");
    }
	public static void main(String[] args) 
	{
		BookImpl4 book1=new BookImpl4();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
		book1.myNewBook();
	}
}
