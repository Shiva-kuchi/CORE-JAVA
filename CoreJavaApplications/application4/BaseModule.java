package com.evergent.corejava.shiva.application4;

public abstract class BaseModule 
{
	 protected int amount;
	    protected int GST;
	    protected int VAT;
	    protected int amountDisc;

	    public BaseModule(int amount, int GST, int VAT) 
	    {
	        this.amount = amount;
	        this.GST = GST;
	        this.VAT = VAT;
	    }

	    abstract void displayMenu();

	    // Store name as a static final field
	    private static final String STORE_NAME = "DMart";

	    public static String getStoreName() 
	    {
	        return STORE_NAME;
	    }
	    // Getters for amount, GST, and VAT
	    public int getAmount() 
	    {
	        return amount;
	    }

	    public int getGST() 
	    {
	        return GST;
	    }

	    public int getVAT() 
	    {
	        return VAT;
	    }
}
