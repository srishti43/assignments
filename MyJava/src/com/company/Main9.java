//Q9.Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)
package com.company;
enum House {
    RawHouse(100),FurnishedHouse(200),SemiFurnishedHouse(150),SingleStoryHouse(300),DoubleStoryHouse(400);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class Main9 {
    public static void main(String args[])
    {
        System.out.println("All House prices:");
        for (House c : House.values())
        {
            System.out.println(c + " costs " + c.getPrice() + " thousand Rupees.");
        }
    }
}
