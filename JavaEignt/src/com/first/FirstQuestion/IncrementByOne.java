package com.first.FirstQuestion;

import java.util.Scanner;

/**
 * Question 1.2: Increment the number by 1 and return the incremented value
 * Parameter (int) Return int
 */
@FunctionalInterface
interface IncrementByOneInterFace {
    int addOne(int number);
}

public class IncrementByOne {
    public static void main(String[] args) {
        IncrementByOneInterFace incrementByOne = number -> number + 1;
        Scanner n =new Scanner(System.in);
        System.out.println("Enter number to increment");
        int n1 = n.nextInt();
        System.out.println(n1+" incremented by one: " + incrementByOne.addOne(n1));
    }
}
