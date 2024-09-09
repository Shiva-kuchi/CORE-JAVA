package com.evergent.corejava.exceptionhandling;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class CompileTimeFileDemo15 
{

	public static void main(String[] args) 
	{
      try 
      {
        File f=new File("c:/desktop/note.txt");
        Scanner input=new Scanner(f);
        while(input.hasNextLine())
        {
          System.out.println(input.nextLine());
        }
        input.close();
       }
       catch(FileNotFoundException e)
        {
          System.out.println("File Not Found exception :" +e.getMessage());
          e.printStackTrace();
        }      
	}

}
