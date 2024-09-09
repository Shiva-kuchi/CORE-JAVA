package com.evergent.corejava.shiva.application4;
import java.util.*;
public class Application4 
{
	 public static void main(String[] args) 
	    {
	        int initialAmount = 0;
	        int initialGST = 0;
	        int initialVAT = 0;

	        OrderModule orderModule = new OrderModule(initialAmount, initialGST, initialVAT);
	        PaymentModule paymentModule = new PaymentModule(initialAmount, initialGST, initialVAT);

	        Scanner input = new Scanner(System.in);
	        boolean exitFlag = false;
	        while (!exitFlag) 
	        {
	            System.out.println("=========================================");
	            System.out.println("Welcome to " + BaseModule.getStoreName() + " E-Commerce Application");
	            System.out.println("Please Select the Module to Proceed:");
	            System.out.println("1 - Order Module");
	            System.out.println("2 - Payment Module");
	            System.out.println("3 - View Order History");
	            System.out.println("4 - Exit");
	            System.out.println("=========================================");
	            System.out.print("Enter your choice: ");
	            String choice = input.nextLine();
	            switch (choice) {
	                case "1":
	                    orderModule.execute();
	                    break;
	                case "2":
	                    paymentModule = new PaymentModule(orderModule.getAmount(), orderModule.getGST(), orderModule.getVAT());
	                    paymentModule.execute();
	                    break;
	                case "3":
	                    orderModule.printOrderHistory();
	                    break;
	                case "4":
	                    exitFlag = true;
	                    System.out.println("Exiting the Application. Thank you for using " + BaseModule.getStoreName() + "!");
	                    break;
	                default:
	                    System.out.println("Invalid Option! Please try again.");
	                    break;
	            }
	        }
	    }
}
