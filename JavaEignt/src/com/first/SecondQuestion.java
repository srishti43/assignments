package com.first;
import java.util.Scanner;

/**
 * Question 2: Create a functional interface whose method takes 2 integers and return one integer
 */

@FunctionalInterface
interface TakesTwoReturnsOne {
    int returnOne(int numberOne, int numberTwo);
}

public class SecondQuestion {
    public static void main(String[] args) {
        TakesTwoReturnsOne takesTwoReturnsOne = (numberOne, numberTwo) -> numberOne + numberTwo;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter integer 1 :");
        int n1 = n.nextInt();

        Scanner nn = new Scanner(System.in);
        System.out.println("Enter integer 2 :");
        int n2 = nn.nextInt();
        System.out.println(takesTwoReturnsOne.returnOne(n1, n2));
    }
}
