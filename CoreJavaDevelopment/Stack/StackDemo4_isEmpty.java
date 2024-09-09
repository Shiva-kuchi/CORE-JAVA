package com.evergent.corejava.Stack;

import java.util.Stack;

public class StackDemo4_isEmpty 
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
      mystack.clear();
      System.out.println(mystack.isEmpty());
	}
}
