package com.Strings;
import java.util.Scanner;
public class DuplicateWordsAndTheirNumberOfOccurrences {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim();sc.close();
        String [] arr = input.split(" ");
        for(int i=0;i<arr.length;i++)
        {
        	int count =1;
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i].equals(arr[j]))
        		{
        			count++;
        			arr[j]="0";
        		}
        	}
        	if(arr[i]!="0" && count>1)
        	{
        		System.out.println(arr[i]+" "+count);
        	}
        }
	}
}