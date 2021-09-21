//Q10.Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concat 2 string
//  F) Concat 3 String
package com.company;

public class Main10{
    public static void sum(int a, int b)
    {
        int s = a + b;
        System.out.println("Sum of two numbers: " +s);
    }

    public static void sum(double a, double b)
    {
        double s = a + b;
        System.out.println("Sum of two numbers: " +s);
    }

    public static void multiply(int a, int b)
    {
        int mul = a * b;
        System.out.println("MUL of two numbers: " +mul);
    }

    public static void multiply(double a, double b)
    {
        double mul = a * b;
        System.out.println("MUL of two numbers: " +mul);
    }

    public static void concat(String a, String b)
    {
        String con = a + b;
        System.out.println("concatenation of two strings: " +con);
    }

    public static void concat(String a, String b , String c)
    {
        String con = a + b +c;
        System.out.println("concatenation of two strings: " +con);
    }

    public static void main(String[] args)
    {
        sum(2,3);
        sum(2.2,3.2);
        multiply(2,3);
        multiply(2.2,3.1);
        concat("saurabh","soni");
        concat("saurabh","soni" , "ABES");
    }


}
