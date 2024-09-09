package com.evergent.corejava.Stack;
import java.util.*;
public class Stack_demo1 
{
	public static void main(String[] args) 
	{
      Stack mystack=new Stack();
      mystack.push("red");
      mystack.push("black");
      mystack.push("white");
      mystack.push(null);
      System.out.println(mystack);
      System.out.println(mystack.pop());
      System.out.println(mystack.pop());
	}
}
