package com.Strings;

import java.util.Scanner;

public class StringToIntAndIntToStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim(); sc.close();
        for(int i=0;i<input.length();i++) {
            System.out.print((int) input.charAt(i)+" ");
        }
        System.out.println("\nEnter a how many numbers you want to enter : ");
        int size= sc.nextInt();
        System.out.println("Enter numbers");
        char [] inputarr = new char[size];
        for (int i = 0; i <size; i++) {
            inputarr[i]=(char)sc.nextInt();
        }

        String output = new String(inputarr);
        System.out.println(output);
    }
}