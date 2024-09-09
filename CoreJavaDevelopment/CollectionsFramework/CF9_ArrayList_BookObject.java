package com.evergent.corejava.CollectionsFramework;
import java.util.*;
public class CF9_ArrayList_BookObject 
{

	public static void main(String[] args) 
	{
	  Book b1=new Book("Core java");
	  Book b2=new Book("let us c");
	  Book b3=new Book("programming Index");
      ArrayList mylist=new ArrayList();
      mylist.add(b1);
      mylist.add(b2);
      mylist.add(b3);
      System.out.println(mylist);
	}

}
