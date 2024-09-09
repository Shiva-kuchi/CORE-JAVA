package com.evergent.corejava.CaseStudy1;
import java.util.*;
public class Main 
{
     public static void main(String args[])
     {
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("Select the option:");
    	 System.out.println("1.Adult\n 2.kids\n");
    	 int choice=input.nextInt();
    	 switch(choice)
    	 {
    	 case 1:
    		 try
        	 {
        		 System.out.println("Enter the username for login:");
        		 String str=input.next();
        		 AdultUser a1=new  AdultUser();
    		    		 if(str.equals("shiva"))
    		    		 {
    		    		
    		    			 a1.UserLogin(str);
    		    			 System.out.println("Enter the registerAccount age");
    		    			 int age=input.nextInt();
    		    			 a1.registerAccount(age);
    		    			 System.out.println("Enter the registerBook Name");
    		    			 String Bname=input.next();
    		    			 a1.requestBook(Bname);
    		    	      }	
    		   }
    		  catch(Exception e)
        	  {
    			   System.out.println(e);
        	  }
    		 break;
    	 case 2:
    		 try
        	 {
        		 System.out.println("Enter the username for login:");
        		 String str=input.next();
        		 KidsUser a1=new  KidsUser();
    		    		 if(str.equals("shiva"))
    		    		 {
    		    		
    		    			 a1.UserLogin(str);
    		    			 System.out.println("Enter the registerAccount age");
    		    			 int age=input.nextInt();
    		    			 a1.registerAccount(age);
    		    			 System.out.println("Enter the registerBook Name");
    		    			 String Bname=input.next();
    		    			 a1.requestBook(Bname);
    		    	      }	
    		   }
    		  catch(Exception e)
        	  {
    			   System.out.println(e);
        	  }
    		 break;
    	 default:
    		   System.out.println("Invalid option");
    		   break;
    	 }
     }
}
