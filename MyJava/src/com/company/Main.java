//Q1. Write a program to replace a substring inside a string with other string ?
package com.company;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a String : ");
     String s1 = sc.nextLine();
     System.out.print("Enter the String to be replaced : ");
     String oldString = sc.nextLine();
     System.out.print("Enter the new String : ");
     String newString =sc.nextLine();

     String replaceString = s1.replace(oldString, newString);
     System.out.println("New String is :"+replaceString);
   }
}
        


    
   
