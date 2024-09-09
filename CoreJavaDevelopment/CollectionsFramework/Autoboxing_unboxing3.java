package com.evergent.corejava.CollectionsFramework;

public class Autoboxing_unboxing3 {

	public static void main(String[] args) 
	{
		float f1=4.5f;
		Float f2=new Float(f1);
		System.out.println(f2);
		float f3=f2.floatValue();
		System.out.println(f3);
		
		double d1=789.89;
		Double d2=new Double(d1);
		System.out.println(d2);
		double d3=d2.doubleValue();
		System.out.println(d3);
		
		byte b1=10;
		Byte b2=new Byte(b1);
		System.out.println(b2);
		byte b3=b2.byteValue();
		System.out.println(b3);
	   	
        char ch1='a';
        Character myc=new Character(ch1);
        System.out.println("value of gfg:" +myc);
	}

}
