package com.Strings;

import java.util.Scanner;
public class NumberOfWords {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim(); sc.close();
        String arr[]= input.split(" ");
        int wordCount=arr.length;
        System.out.println("The total number of words in the given string is : "+wordCount);
    }
}
