package com.evergent.corejava.generalprogramming;

public class MaxOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=20,num3=30,num4=40,num5=50;
		int max=num1;
		if(num2>=max)
		{
			max=num2;
		}
		if(num3>=max)
		{
			max=num3;
		}
		if(num4>=max)
		{
			max=num4;
		}
		if(num5>=max)
		{
			max=num5;
		}
        System.out.print(max);

	}

}
