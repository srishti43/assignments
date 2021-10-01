package com.first.FirstQuestion;
import java.util.Scanner;

/**
 * Question 1.3: Concatenation of 2
 * Parameter (String, String) Return String
 */
@FunctionalInterface
interface TwoStringConcatenationInterface {
    String concatTwoStrings(String stringOne, String stringTwo);
}

public class TwoStringConcatenation {
    public static void main(String[] args) {
        TwoStringConcatenationInterface twoStringConcatenation = (stringOne, stringTwo) -> stringOne.concat(stringTwo);

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 :");
        String s = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter String2 :");
        String s1 = sc.nextLine();



        System.out.println("Star concatenated with Wars: " + twoStringConcatenation.concatTwoStrings(s, s1));
    }
}
