package com.evergent.corejava.CaseStudy1;

public class AdultUser implements LibraryUser
{
	public void registerAccount(int age) throws AgeNotSupportException
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			throw new AgeNotSupportException("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook(String btype) throws  BookNotFoundException
	{
		     if(btype.equals("Fiction"))
		     {
		    	 System.out.println("Book Issued successfully, please return the book within 7 days");
		     }
		     else
		     {
		    	 throw new  BookNotFoundException("Oops, you are allowed to take only kids books");
		     }
	}
	public void UserLogin(String name) throws UserNotFoundException
	{
		if(name.equals("shiva"))
		{
			System.out.println("Successfully login");
		}
    	else
    	{
    		throw new UserNotFoundException("Enter correct credinals");
    	}
		  
	}
}
