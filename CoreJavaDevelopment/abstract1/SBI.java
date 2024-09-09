package com.evergent.corejava.abstract1;

public class SBI extends Bank 
{
	 int amount;
	 public SBI(int amount)
	 {
		 this.amount=amount;
	 }
	public void credit(int amt)
	 {
		 if(amt<=amount)
		 {
			 amount-=amt;
		 }
		 else
		 {
			 System.out.println("You Dont have suffient funds");
		 }
	 }
	 public void debit(int amt)
	 {
		 amount+=amt;
	 }
	 public void Check_Balance()
	 {
		 System.out.println("your curent amount in the account is:" +amount);
	 }
	public static void main(String[] args) 
	{
            SBI u1=new SBI(1000);
            u1.Check_Balance();
            u1.credit(3500);
            u1.debit(1000);
            u1.customer_care();
	}
		

}
