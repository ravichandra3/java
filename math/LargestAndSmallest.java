package com.math;
import java.util.Scanner;
public class LargestAndSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("how many numbers are you going to enter ?");
		int size= sc.nextInt();
		System.out.println("Enter the numbers : ");
		int array [] = new int[size];
		int temp=0;
		for(int i=0; i<size;i++)
		{
			array [i]= sc.nextInt();
		}
		sc.close();
		for(int i=0; i<size; i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
				temp = array[j];
				array[j]=array[j+1];
				array[j+1]= temp;
				}
			}
		}
		System.out.println("Smallest number is : "+array[0]);
		System.out.println("Largest number is : "+array[array.length-1]);
	}
}
