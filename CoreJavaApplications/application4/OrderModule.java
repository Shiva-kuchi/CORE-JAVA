package com.evergent.corejava.shiva.application4;
import java.util.*;
class OrderModule extends BaseModule implements Module  
{
	private List<String> orderHistory = new ArrayList<>();

    public OrderModule(int amount, int GST, int VAT) 
    {
        super(amount, GST, VAT);
    }

    public void execute() 
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag) 
        {
            displayMenu();
            String opt = input.nextLine();
            switch (opt.toUpperCase()) 
            {
                case "C":
                    handleClothing();
                    break;
                case "SG":
                    handleSmartGadgets();
                    break;
                case "G":
                    handleGrocery();
                    break;
                case "A":
                    handleAppliances();
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
            System.out.println("If Want To Stay in Order Module Again: YES/NO");
            flag = input.nextLine().equalsIgnoreCase("yes");
        }
    }

    private void handleClothing() 
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) 
        {
            System.out.println("Menu \t\t Description \t\t Charge per Head");
            System.out.println("==========================================================");
            System.out.println("MEN \t\t Jeans, Shirts, Hoodies \n\t\t Pants \n\t\t Trousers \n\t\t Coat \t\t\t\t RS:799.00");
            System.out.println("WOMEN \t\t Dresses, Skirts, Tops \n\t\t Blouses \n\t\t Shoes \n\t\t Handbags \t\t\t RS:999.00");
            System.out.println("KIDS \t\t T-Shirts, Shorts, Dresses \n\t\t Jackets \n\t\t Flip-flops \n\t\t T-Shirts \t\t\t RS:2999.00");
            System.out.println("==========================================================");
            System.out.print("Enter your Menu code (MEN,WOMEN,KIDS) : ");
            String opt = input.nextLine();
            switch (opt.toUpperCase()) 
            {
                case "MEN":
                    amount += 799;
                    GST += 70;
                    VAT += 88;
                    recordOrder("MEN - Jeans, Shirts, Hoodies", 799);
                    break;
                case "WOMEN":
                    amount += 999;
                    GST += 90;
                    VAT += 113;
                    recordOrder("WOMEN - Dresses, Skirts, Tops", 999);
                    break;
                case "KIDS":
                    amount += 2999;
                    GST += 170;
                    VAT += 158;
                    recordOrder("KIDS - T-Shirts, Shorts, Dresses", 2999);
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
            System.out.println("If Want To Purchase Clothes Again: YES/NO");
            flag = input.nextLine().equalsIgnoreCase("yes");
        }
    }

    private void handleSmartGadgets() 
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Menu \t\t Description \t Charge per Unit");
            System.out.println("=========================================================");
            System.out.println("GADGETS \t Laptop                 50000\n\t\t Smartwatch             2999\n\t\t Earbuds                1999");
            System.out.print("Enter your Menu code (LP,SW,EB) : ");
            String opt = input.nextLine();
            switch (opt.toUpperCase()) {
                case "LP":
                    amount += 50000;
                    GST += 2200;
                    VAT += 3000;
                    recordOrder("Laptop", 50000);
                    break;
                case "SW":
                    amount += 2999;
                    GST += 1700;
                    VAT += 2300;
                    recordOrder("Smartwatch", 2999);
                    break;
                case "EB":
                    amount += 1999;
                    GST += 370;
                    VAT += 288;
                    recordOrder("Earbuds", 1999);
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
            System.out.println("If Want To Purchase SmartGadgets Again: YES/NO");
            flag = input.nextLine().equalsIgnoreCase("yes");
        }
    }

    private void handleAppliances() 
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Menu \t\t\t Description \t Charge per Unit");
            System.out.println("=========================================================");
            System.out.println("APPLIANCES \t Refrigerator               25000\n\t\t Washing Machine            30000\n\t\t Air Conditioner            33000");
            System.out.print("Enter your Menu code (WM,RF,AC) : ");
            String opt = input.nextLine();
            switch (opt.toUpperCase()) {
                case "WM":
                    amount += 30000;
                    GST += 2700;
                    VAT += 1998;
                    recordOrder("Washing Machine", 30000);
                    break;
                case "RF":
                    amount += 25000;
                    GST += 2100;
                    VAT += 1700;
                    recordOrder("Refrigerator", 25000);
                    break;
                case "AC":
                    amount += 35000;
                    GST += 3000;
                    VAT += 2100;
                    recordOrder("Air Conditioner", 35000);
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
            System.out.println("If Want To Purchase APPLIANCES Again: YES/NO");
            flag = input.nextLine().equalsIgnoreCase("yes");
        }
    }

    private void handleGrocery() 
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Category \t Description \t Charge per Unit");
            System.out.println("===================================================");
            System.out.println("GROCERIES \t Vegetables             500\n\t\t Fruits                 250\n\t\t Milk                   50\n\t\t Household Items        2000");
            System.out.print("Enter your Menu code (VG,FR,MK,HI) : ");
            String opt = input.nextLine();
            switch (opt.toUpperCase()) {
                case "VG":
                    amount += 500;
                    recordOrder("Vegetables", 500);
                    break;
                case "FR":
                    amount += 250;
                    recordOrder("Fruits", 250);
                    break;
                case "MK":
                    amount += 50;
                    GST += 7;
                    VAT += 8;
                    recordOrder("Milk", 50);
                    break;
                case "HI":
                    amount += 2000;
                    GST += 70;
                    VAT += 88;
                    recordOrder("Household Items", 2000);
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
            System.out.println("If Want To Purchase GROCERIES Again: YES/NO");
            flag = input.nextLine().equalsIgnoreCase("yes");
        }
    }

    // Record order for history
    private void recordOrder(String item, int price) 
    {
        orderHistory.add(item + " - Rs." + price);
    }

    // Print order history
    public void printOrderHistory() {
        if (orderHistory.isEmpty()) 
        {
            System.out.println("No orders placed yet.");
        } 
        else 
        {
            System.out.println("Order History:");
            for (String order : orderHistory) 
            {
                System.out.println(order);
            }
        }
    }

    void displayMenu() {
        System.out.println("===============================");
        System.out.println("C  - Select Clothing");
        System.out.println("SG - Select Smart Gadgets");
        System.out.println("G  - Select Grocery");
        System.out.println("A  - Select Appliances");
        System.out.println("===============================");
    }
}
