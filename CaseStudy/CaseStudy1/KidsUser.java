package com.evergent.corejava.CaseStudy1;

public class KidsUser implements LibraryUser
{
	public void registerAccount(int age) throws AgeNotSupportException
	{
	     if(age<12)
	     {
	    	 System.out.println("You have successfully registered under a Kids Account");
	     }
	     else
	     {
	    	 throw new AgeNotSupportException("Sorry, Age must be less than 12 to register as a kid");
	     }
	}
	   public void requestBook(String btype) throws BookNotFoundException
	   {
		     if(btype.equals("Kids"))
		     {
		    	 System.out.println("Book Issued successfully, please return the book within 10 days");
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
