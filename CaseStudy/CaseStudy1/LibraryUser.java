package com.evergent.corejava.CaseStudy1;

public interface LibraryUser 
{
   public void registerAccount(int age) throws AgeNotSupportException;
   public void requestBook(String btype) throws BookNotFoundException;
   public void UserLogin(String name) throws UserNotFoundException;
}
