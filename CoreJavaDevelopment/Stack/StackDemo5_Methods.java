package com.evergent.corejava.Stack;

import java.util.Stack;
//1.0 version on words..............
//In real time  it used in perfroming undo-paste operations 
public class StackDemo5_Methods 
{
	public static void main(String[] args) 
	{
      Stack mystack=new Stack();
      mystack.push("red");//push method
      mystack.push("black");
      mystack.push("white");
      System.out.println(mystack);
      System.out.println(mystack.pop());//pop method
      System.out.println(mystack.pop());
      System.out.println(mystack.peek());//peek method
      System.out.println(mystack.search("white"));//if not found it will print -1
      mystack.clear();//clear method
      System.out.println(mystack.isEmpty());//isEmpty method
	}
}
