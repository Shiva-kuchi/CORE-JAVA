package com.evergent.corejava.Arrays;

public class TwoDimArrays7 {

	public static void main(String[] args) {
		
		int count=25;
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=count;
				count--;
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
