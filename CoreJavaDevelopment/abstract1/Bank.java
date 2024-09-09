package com.evergent.corejava.abstract1;

public abstract class Bank 
{
   abstract public void credit(int amt);
   abstract public void debit(int amt);
   abstract public void Check_Balance();
   public void customer_care()
   {
	   System.out.println("For any quires you can contact SBI main branch");
   }
   
}
