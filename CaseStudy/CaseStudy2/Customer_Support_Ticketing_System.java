package com.evergent.corejava.CaseStudy2;
import java.util.*;
public class Customer_Support_Ticketing_System 
{
	Deque ticketQueue=new ArrayDeque();
    List<String> TicketList=new ArrayList<>();
	public void addTicket(String ticket)
	{
		    if(!TicketList.contains(ticket))
		    {	
		    	TicketList.add(ticket);
		    	ticketQueue.add(ticket);
		    	System.out.println("sucessfully Booked your Ticket :" +ticket);
		    }
		    else
		    {
		    	System.out.println("Already The Ticket Number "+ticket+" has Been Booked");
		    }
	}
	public void processNextTicket(String str)
	{
		if(!ticketQueue.isEmpty() && TicketList.contains(str))
		{
			System.out.println("sucessfully cancelled your Ticket :"+ticketQueue.poll());			
		}
		else
		{
			if(ticketQueue.isEmpty())
			{
			   System.out.println("Your Queue is Empty");
			}
			else
			{
				System.out.println("You Have Entered Invaild Ticket Number To Cancel");
			}
		}	  
	}
	public void peekNextTicket()
	{
		if(!ticketQueue.isEmpty())
		{   
			System.out.print("peek Ticket is :" +ticketQueue.peek());
		}
		else
		{
			System.out.println("Your Queue is Empty");
		}
	}
	public  void displayQueue()
	{
		if(!ticketQueue.isEmpty())
		{
			 System.out.println("List of the Ticket Number Booked");
			 for(Object s:ticketQueue)
			 {
				 System.out.println("Ticket Number:"+s);
			 }
		}
		else
		{
			System.out.println("Your Queue is Empty");
		}
	}
	public void checkIsEmpty()
	{
		  if(!ticketQueue.isEmpty())
		  {
			  System.out.println("Your Queue is not empty");
		  }
		  else
		  {
             System.out.println("Queue is empty");
		  }
   }
   public static void main(String args[])
   {
	   Scanner input=new Scanner(System.in);
	   Customer_Support_Ticketing_System q1=new Customer_Support_Ticketing_System();
	   System.out.println("Customer Support Ticketing System :");
	   boolean flag=true;
	   String str=null;
	   while(flag)
	   {
	     System.out.println(" 1.Add-Ticket\n 2.processNextTicket \n 3.peekNextTicket \n 4. displayQueue \n 5.checkIsEmpty \n 6.Exit");
	     System.out.print("Enter your choice:");
	     int choice=input.nextInt();
	     switch(choice)
	     {
	         case 1:
	        	   System.out.print("Enter The Ticket Number You Want :");
	        	   str=input.next();
	        	   q1.addTicket(str);
	        	   break;
	         case 2:
	        	 System.out.print("Enter The Ticket Number You Want Cancel :");
	        	 str=input.next();
	        	 q1.processNextTicket(str);
	        	 break;
	         case 3:
	        	  System.out.print("Enter The Ticket Peek-Ticket");
	        	  q1.peekNextTicket();
	        	   break;
	         case 4:
	        	   q1.displayQueue();
	        	   break;
	         case 5:
	        	   q1.checkIsEmpty();
	        	   break;
	         case 6:
	        	   System.out.println("Thank you for Booking Ticket");
	        	   System.exit(0);
	         default: 
	        	   System.out.println("Enter a vaild Choice");
	        	   break;
	     }     
      }
   }
}
