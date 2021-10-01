package com.first;
/**
 * Question 6: Create and access default and static methods of an interface
 */
// @FunctionalInterface
interface InterfaceForDisplaying {
    default void displayDefault() {
        System.out.println("default method defined in an interface");
    }

    static void displayStatic() {
        System.out.println("static method defined in an interface");
    }

    void displayAbstract();
}

public class SixQuestion implements InterfaceForDisplaying {
    @Override
    public void displayAbstract() {
        System.out.println("abstract method defined in an implementing class");
    }

    public static void main(String[] args) {
        SixQuestion demo = new SixQuestion();
        demo.displayDefault();
        InterfaceForDisplaying.displayStatic();
        demo.displayAbstract();
    }
}
