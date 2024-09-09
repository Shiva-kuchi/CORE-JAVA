package com.evergent.corejava.shiva.application2;
import java.util.*;
public class Application
{
    enum Module{O,P,S,E} 
    enum ItemModule{C,SG,G,A}
    enum PayModule{T,P,S}
    enum Services{CL,ML,M}
    enum Cloth{MEN,WOMEN,KIDS}
    enum SmartGad{LP,SW,EB}
    enum Appliances{WM,RF,AC}
    enum Grocery{VG,FR,MK,HI}
	static int amount;
    static int GST;
    static int VAT;
	static int amountdisc;

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String opt=null;
        boolean flag=true;
        String choice=null;
        System.out.println("\n\t\tWelcome to DMart");
        while(true)
        {
            System.out.println("\n===============================");
            System.out.println("         DMart Main Menu        ");
            System.out.println("================================");
            System.out.println("O - Order Module");
            System.out.println("P - Payment Module");
            System.out.println("S - Services Module");
            System.out.println("E - Quit Module");
            System.out.println("===============================");
            System.out.println();
            System.out.print("Enter your module code (O, P, S, E): ");            
            opt=input.nextLine();
            System.out.print("You entered module is  : "+opt);
            System.out.println();
            switch(Module.valueOf(opt))
            {
                case O:     
                    System.out.println("\nOrder Module");
                    flag=true;    
                    while(flag)
                    {    
                        System.out.println("===============================");
                        System.out.println("C  - Select Clothing");
                        System.out.println("SG - Select Smart Gadgets");
                        System.out.println("G  - Select Grocery");
                        System.out.println("A  - Select Appliances");
                        System.out.println("===============================");
                        System.out.println("");
                        System.out.print("Enter your module code (C, SG, G, A): ");
                        opt=input.nextLine();
                        System.out.println();

                        switch(ItemModule.valueOf(opt))
                        {
                             case C:
                                    System.out.println("Menu \t\t Description \t\t Charge per Head");
                                    System.out.println("==========================================================");
                                    System.out.println("MEN \t\t Jeans, Shirts, Hoodies \n\t\t Pants \n\t\t Trousers \n\t\t Coat \t\t\t\t RS:799.00");
                                    System.out.println("");
                                    System.out.println("WOMEN \t\t Dresses, Skirts, Tops \n\t\t Blouses \n\t\t Shoes \n\t\t Handbags \t\t\t RS:999.00");
                                    System.out.println("");
                                    System.out.println("KIDS \t\t T-Shirts, Shorts, Dresses \n\t\t Jackets \n\t\t Flip-flops \n\t\t T-Shirts \t\t\t RS:2999.00");
                                    System.out.println("==========================================================");
                             
                                while(flag)
                                {  
                                    System.out.print("Enter your Menu code (MEN,WOMEN,KIDS) : ");
                                    opt=input.nextLine();
                                    System.out.println();
                                    switch(Cloth.valueOf(opt))
                                    {
                                        case MEN:
                                                System.out.println("You Have Purchased MEN WEAR");
                                                amount+=799;
                                                GST+=70;
                                                VAT+=88;
                                                break;
                                        case WOMEN:
                                                System.out.println("You Have Purchased WOMEN WEAR");
                                                amount+=999;
                                                GST+=90;
                                                VAT+=113;
                                                break;
                                        case KIDS:
                                                System.out.println("You Have Purchased KIDS WEAR");
                                                amount+=2999;
                                                GST+=170;
                                                VAT+=158;
                                                break;       
                                    }
                                    System.out.println("If Want To Purchase Clothes Again: YES/NO");
                                    choice = input.nextLine();
                                    flag=choice.equalsIgnoreCase("yes") ? true : false;
                                    System.out.println("");
                                }
                                break;
                                
                            case SG:
                                    System.out.println("Menu \t\t Description \t Charge per Unit");
                                    System.out.println("=========================================================");
                                    System.out.println("GADGETS \t Laptop                 50000\n\t\t Smartwatch             2999\n\t\t Earbuds                1999\t\t\t");
                                    System.out.println("");
                                    flag=true;
                                    while(flag)
                                    {
                                        System.out.println();
                                        System.out.print("Enter your Menu code (LP,SW,EB) : ");
                                        opt=input.nextLine();
                                        System.out.println();
                                        switch(SmartGad.valueOf(opt))
                                        {
                                            case LP:
                                                  amount+=50000;
                                                  GST+=999;
                                                  VAT+=300;
                                                  break;
                                            case SW:
                                                  amount+=2999;
                                                  GST+=100;
                                                  VAT+=200;
                                                  break;
                                            case EB:
                                                 amount+=1999;
                                                 GST+=370;
                                                 VAT+=288;
                                                 break;
                                        }
                                        
                                        System.out.println("If Want To Purchase SmartGadgets Again: YES/NO");
                                        choice = input.nextLine();
                                        System.out.println();
                                        flag=choice.equalsIgnoreCase("yes") ? true : false;
                                    }
                                    break;
                            case A:
                            	
                                    System.out.println("Menu \t\t\t Description \t Charge per Unit");
                                    System.out.println("=========================================================");
                                    System.out.println("APPLIANCES \t Refrigerator               25000\n\t\t Washing Machine            30000\n\t\t Air Conditioner            33000\n\t\t");
                                    System.out.println("");
                                    flag=true;
                                    while(flag)
                                    {
                                        System.out.println();
                                        System.out.print("Enter your Menu code (WM,RF,AC) : ");
                                        opt=input.nextLine();
                                        System.out.println();
                                        switch( Appliances.valueOf(opt))
                                        {
                                            case WM:
                                                    amount+=30000;
                                                    GST+=900;
                                                    VAT+=199;
                                                    break;
                                            case RF:
                                                    amount+=25000;
                                                    GST+=980;
                                                    VAT+=170;
                                                    break;
                                            case AC:
                                                amount+=35000;
                                                GST+=987;
                                                VAT+=210;
                                                break;
                                        }
                                        System.out.println("If Want To Purchase APPLIANCES Again: YES/NO");
                                        choice = input.nextLine();
                                        flag=choice.equalsIgnoreCase("yes") ? true : false;
                                    }
                                    break;
                                    
                            case G:
                                    System.out.println("Category \t Description \t Charge per Unit");
                                    System.out.println("===================================================");
                                    System.out.println("GROCERIES \t Vegetables             500\n\t\t Fruits                 250\n\t\t Milk                   50\n\t\t Household Items        2000\t\t\t");
                                    System.out.println("");
                                    flag=true;
                                    while(flag)
                                    {
                                        System.out.println();
                                        System.out.print("Enter your Menu code (VG,FR,MK,HI) : ");
                                        opt=input.nextLine();
                                        System.out.println();
                                        switch(Grocery.valueOf(opt))
                                        {
                                            case VG:
                                                amount+=500;
                                                GST+=0;
                                                VAT+=0;
                                                break;
                                            case FR:
                                                amount+=250;
                                                GST+=0;
                                                VAT+=0;
                                                break;
                                            case MK:
                                                amount+=50;
                                                GST+=7;
                                                VAT+=8;
                                                break;
                                            case HI:
                                              amount+=2000;
                                              GST+=70;
                                              VAT+=88;
                                        }
                                        System.out.println("If Want To Purchase GROCERIES Again: YES/NO");
                                        choice = input.nextLine();
                                        flag=choice.equalsIgnoreCase("yes") ? true : false;
                                    }
                            break;
                        }
                        
                        System.out.println("If Want To Stay Order Module Again: YES/NO");
                        choice = input.nextLine();
                        flag=choice.equalsIgnoreCase("yes") ? true : false;     
                    }
                    break;
                case P:
                        if(amount<=10000)
                            amountdisc=(int) (amount-(amount*0.03));
                        if(amount>10000 && amount<=25000)
                            amountdisc=(int) (amount-(amount*0.07));
                        else if(amount >25000 && amount <=50000)
                            amountdisc=(int) ((amount-amount*0.11));
                        else if(amount >50000 && amount <=100000)
                            amountdisc=(int) ((amount-(amount*0.16)));	
                        else if(amount > 100000)
                            amountdisc=(int) ((amount-(amount*0.20)));
                        flag=true;
                        
                        System.out.println();
                        System.out.println("Payment Module");
                        
                       while(flag)
                      {     
                        System.out.println("===============================");
                        System.out.println("T - Display Total Amount");
                        System.out.println("P - Display Amount After Discount Excuding Tax");
                        System.out.println("S - Total Summary of Amount");
                        System.out.println("===============================");    
                        System.out.println();
                        System.out.print("Enter your Module code (T,P,S) : ");
                        opt=input.nextLine();
                        System.out.println();
                        
                        switch(PayModule.valueOf(opt)) 
                        {
                        
                            case T:
                                System.out.println("Amount For Ordered Products Before Discount is Rs:"+amount);
                                break;
                            case P:
                                System.out.println("Amount For Total After Discount For Selected Guests is  Rs:"+amountdisc); 
                                break;      
                            case S:  
                            	    System.out.println("Amount for Total Products before discount is Rs:"+amount);
                                    System.out.println("Amount for total Products after Discount  Rs:"+amountdisc);
                                    System.out.println("Goods And services Tax:"+GST);
                                    System.out.println("Value Added Tax:"+VAT);
                                    System.out.println("Additional charges(GST+VAT):"+(GST+VAT)); 
                                    System.out.println("Final Amount To Be Paid:"+(amountdisc+(GST+VAT))); 
                                    break;
                        }
                        
                          System.out.println("If You To Check Further Payments Details Again? : YES/NO");
                          choice = input.nextLine();
                          flag=choice.equalsIgnoreCase("yes") ? true : false;
                      }
                    break;
                    
                case S:
                        System.out.println();
                        System.out.println("Services Module");
                        System.out.println("===============================");
                        System.out.println("CL - Connect To service Person Through Call");
                        System.out.println("ML - Connect To service Person Through Email");
                        System.out.println("M - Return to Main Menu");
                        System.out.println("===============================");
                        System.out.println();
                        System.out.print("Select The Available Option:");
                        opt=input.nextLine(); 
                        switch(Services.valueOf(opt))
                        {
                           case CL:
                                  System.out.println("Please Do Contact/CALL +123456789");
                                  break;
                            case ML:
                                  System.out.println("Please Do Email at Dmart@gmail.com");
                                  break;
                            case M:
                                  break;
                        }
                        break;
                case E:
                    System.out.println("Thank You for Visting!");
                    System.exit(0);    
            }
        }  
    }
}


