package com.Strings;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String inputString = sc.nextLine(); sc.close();
        String output = "";
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (97<=c && c<=122) {
                c=(char)((c-32));
            }
            output = output + c;
        }
        System.out.println(output);
    }
}
