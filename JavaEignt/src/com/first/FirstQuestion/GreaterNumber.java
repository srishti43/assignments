package com.first.FirstQuestion;
import java.util.Scanner;
/**
 * Question 1.1: First number is greater than second number or not
 * Parameter (int, int) Return boolean
 */
@FunctionalInterface
interface GreaterNumberInterFace {
    boolean isFirstNumberGreater(int firstNumber, int secondNumber);
}
public class GreaterNumber {
    public static void main(String[] args) {
        GreaterNumberInterFace greaterNumber = (firstNumber, secondNumber) -> {
            if (firstNumber > secondNumber)
                return true;
            else return false;
        };
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter number 2 :");
        int numb = num1.nextInt();
        System.out.println( greaterNumber.isFirstNumberGreater(num, numb));
        
    }
}
