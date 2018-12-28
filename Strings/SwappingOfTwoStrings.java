package com.Strings;

import java.util.Scanner;

public class SwappingOfTwoStrings {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first String : ");
        String str1 = sc.nextLine().trim();
        System.out.println("Enter a second String : ");
        String str2 = sc.nextLine().trim(); sc.close();
        String str3 =str1;
        str1=str2;
        str2=str3;
        System.out.println("First String : "+str1);
        System.out.println("Second String : "+str2);

	}
}
