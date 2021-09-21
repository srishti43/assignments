//Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively.

package com.company;

public class Main7{
    public static  String name = "Srishti";
    public static String surname ="Sharma";
    public static int age = 21;

    static
    {
        System.out.println("Calling the static block and it's Data-------");
        System.out.println("my name is: "+Main7.name);
        System.out.println("my surname is: "+Main7.surname);
        System.out.println("my age is: "+Main7.age);
        System.out.println("\n");
    }

    public static void printPersonDetails(String name_ , String surname_ , int age_)
    {
        System.out.println("my name is: "+name_);
        System.out.println("my surname is: "+surname_);
        System.out.println("my age is: "+age_);
    }

    public static void main(String args[])
    {
        System.out.println("Calling with the help of static variables-------");
        System.out.println("my name is: "+Main7.name);
        System.out.println("my surname is: "+Main7.surname);
        System.out.println("my age is: "+Main7.age);
        System.out.println("\n");

        System.out.println("Calling with the help of static method-------");
        Main7.printPersonDetails("Srishti", "Sharma",21);

    }

}
