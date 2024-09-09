package com.evergent.corejava.shiva.application4;
import java.util.*;
class PaymentModule extends BaseModule implements Module 
{
	 private int loyaltyPoints = 0;
	    private boolean couponApplied = false;

	    public PaymentModule(int amount, int GST, int VAT) 
	    {
	        super(amount, GST, VAT);
	    }

	    public void execute() 
	    {
	        Scanner input = new Scanner(System.in);
	        boolean flag = true;
	        calculateDiscount();
	        calculateLoyaltyPoints();
	        while (flag) {
	            displayMenu();
	            String opt = input.nextLine();
	             switch (opt.toUpperCase()) {
	                case "T":
	                    System.out.println("Amount For Ordered Products Before Discount is Rs:" + getAmount());
	                    break;
	                case "P":
	                    System.out.println("Amount For Total After Discount Excluding Tax is Rs:" + amountDisc);
	                    break;
	                case "S":
	                    System.out.println("Amount for Total Products before discount is Rs:" + getAmount());
	                    System.out.println("Amount for total Products after Discount  Rs:" + amountDisc);
	                    System.out.println("Amount for GST after discount Rs:" + getGST());
	                    System.out.println("Amount for VAT after discount Rs:" + getVAT());
	                    int totalAmount = amountDisc + getGST() + getVAT();
	                    System.out.println("Total Payment with Tax after Discount Rs:" + totalAmount);
	                    break;
	                case "APPLY COUPON":
	                    applyCoupon();
	                    break;
	                case "LOYALTY POINTS":
	                    System.out.println("You have " + loyaltyPoints + " loyalty points.");
	                    break;
	                default:
	                    System.out.println("Invalid Option! Please try again.");
	                    break;
	            }
	            System.out.println("If Want To Stay in Payment Module Again: YES/NO");
	            flag = input.nextLine().equalsIgnoreCase("yes");
	        }
	    }

	    private void calculateDiscount() 
	    {
	        if (amount <= 10000)
	            amountDisc = (int) (amount - (amount * 0.03));
	        else if (amount <= 25000)
	            amountDisc = (int) (amount - (amount * 0.07));
	        else if (amount <= 50000)
	            amountDisc = (int) (amount - (amount * 0.13));
	        else if (amount <= 100000)
	            amountDisc = (int) (amount - (amount * 0.17));
	        else
	            amountDisc = (int) (amount - (amount * 0.24));
	    }

	    private void calculateLoyaltyPoints() 
	    {
	        loyaltyPoints = amount / 100;  // 1 point for every Rs. 100
	    }

	    private void applyCoupon() 
	    {
	        Scanner input = new Scanner(System.in);
	        if (couponApplied) 
	        {
	            System.out.println("Coupon has already been applied.");
	        } 
	        else
	        {
	            System.out.print("Enter Coupon Code: ");
	            String couponCode = input.nextLine();
	            if (couponCode.equals("SAVE10")) {
	                amountDisc -= 500; 
	                couponApplied = true;
	                System.out.println("Coupon applied successfully! Rs. 500 has been deducted.");
	            } else {
	                System.out.println("Invalid Coupon Code.");
	            }
	        }
	    }

	    void displayMenu() 
	    {
	        System.out.println("===============================");
	        System.out.println("T  - View Total Amount");
	        System.out.println("P  - View Amount After Discount");
	        System.out.println("S  - View Summary with Tax");
	        System.out.println("APPLY COUPON - Apply a Discount Coupon");
	        System.out.println("LOYALTY POINTS - Check Loyalty Points");
	        System.out.println("===============================");
	    }
}
