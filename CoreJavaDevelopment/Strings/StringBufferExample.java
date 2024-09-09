package com.evergent.corejava.Strings;
//append is used a add string to end of current string
//insert is used to insert a string at specfic location
//replace is used replace a substring with new string
//delete is used remove the substring
//reverse is used to reverse the characters of a string
//capacity is used to find the capacity of the string
public class StringBufferExample {

	public static void main(String[] args) 
	{
      StringBuffer sb=new StringBuffer("Hello");
      System.out.println("Initial String:" +sb);
      sb.append("World");
      System.out.println("After Appending:" +sb);
      sb.insert(5, "Beautiful");
      System.out.println("After Insertion:" +sb);
      sb.replace(0,5,"Hi");
      System.out.println("After replace:" +sb);
      sb.delete(0,3);
      System.out.println("After Deletion:" +sb);
      sb.reverse();
      System.out.println("After revese:" +sb);
      System.out.println("Capacity:" +sb.capacity());
      System.out.println("StringBuffer length:" +sb.length());
	}

}
