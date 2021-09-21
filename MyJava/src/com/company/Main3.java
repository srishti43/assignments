//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
package com.company;
import java.io.*;

class Main3 {
    static int countinString(char ch, String s)
    {
        //base case;
        if(s.length()==0)
            return 0;
        int count = 0;

        //checking if the first character of
        //the given string is that character
        //or not
        if(s.charAt(0)==ch)
            count++;

        //this will count the occurrence of
        //given character in the string
        //from index 1 to the last
        //index of the string
        count+=countinString(ch,s.substring(1));


        return count;
    }
    public static void main (String[] args) {
        String str= "srishti sharma";
        char c = 's';
        System.out.println(countinString(c,str));
    }
}
