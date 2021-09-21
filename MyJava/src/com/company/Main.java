//Q1. Write a program to replace a substring inside a string with other string ?
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String one = "My name is Srishti";
        String two = "Srishti Sharma";
        String modified = one.replace("Srishti", two);
        System.out.println("Original String is: " + one);
        System.out.println("modified string is: " + modified);
    }
}
