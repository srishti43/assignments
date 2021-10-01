// Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
package com.company;
import java.util.Scanner;
public class Main2
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String st = sc.nextLine();
        System.out.println(st);
        int count;

        //Converts the string into lowercase
        st = st.toLowerCase();

        //Split the string into words using built-in function  
        String words[] = st.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}