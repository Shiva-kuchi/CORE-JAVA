package com.evergent.corejava.Stack;
import java.util.Stack;
public class StackDemo3_search 
{
	public static void main(String[] args) 
	{
      Stack mystack=new Stack();
      mystack.push("red");
      mystack.push("black");
      mystack.push("white");
      System.out.println(mystack);
      System.out.println(mystack.peek());
      System.out.println(mystack.search("white"));
	}
}
