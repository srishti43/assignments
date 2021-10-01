package com.first.FirstQuestion;

import java.util.Scanner;

/**
 * Question 1.4: Convert a string to uppercase and return it
 * Parameter String Return String
 */
@FunctionalInterface
interface StringToUppercaseInterFace {
    String stringToUpper(String myString);
}

public class StringToUppercase {
    public static void main(String[] args) {
        StringToUppercaseInterFace stringToUppercaseobj = myString -> myString.toUpperCase();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to convert to uppercase :");
        String sc = s.nextLine();
        System.out.println("String in uppercase: " + stringToUppercaseobj.stringToUpper(sc));
    }
}
