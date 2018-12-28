package com.Strings;

import java.util.Scanner;

public class CountOfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String input = sc.nextLine().toLowerCase();
        sc.close();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Total number of vowels is : " + vowels);
        System.out.println("Total number of consonants is : " + consonants);
    }
}
