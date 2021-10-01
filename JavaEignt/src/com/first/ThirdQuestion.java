package com.first;
import java.util.Scanner;
/**
 * Question 3: Using (instance) method reference create and apply
 * add and subtract method and using (static) method reference
 * create and apply multiplication method for the functional interface created
 */
@FunctionalInterface
interface OperationInterFace
{
    int processIntegers(int numberOne, int numberTwo);
}
public class ThirdQuestion {
    int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
    static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number one :");
        int n1 = n.nextInt();

        Scanner nn = new Scanner(System.in);
        System.out.println("Enter number two :");
        int n2 = nn.nextInt();
        
        OperationInterFace operation = new ThirdQuestion()::add;
        System.out.println("Adding: " + operation.processIntegers(n1, n2));
        operation = new ThirdQuestion()::subtract;
        System.out.println("Subtract: " + operation.processIntegers(n1, n2));
        operation = ThirdQuestion::multiply;
        System.out.println("Multiplying: " + operation.processIntegers(n1, n2));
    }
}
