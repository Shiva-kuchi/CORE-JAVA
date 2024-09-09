package com.evergent.corejava.Stack;

import java.util.Stack;

public class StackDemo6_loop 
{
	public static void main(String[] args) 
	{
      Stack mystack=new Stack();
      mystack.push("red");//push method
      mystack.push("black");
      mystack.push("white");
      mystack.push("green");//push method
      mystack.push("blue");
      mystack.push("yellow");
      mystack.push("pink");//push method
      System.out.println(mystack);
      System.out.println(mystack.pop());//pop method
      System.out.println(mystack.pop());
      System.out.println(mystack.peek());//peek method
      System.out.println(mystack.search("white"));//if not found it will print -1
      mystack.clear();//clear method
      System.out.println(mystack.isEmpty());//isEmpty method
	}
}
