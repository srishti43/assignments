package com.first.ftn;
import java.util.HashSet;
import java.util.Set;

public class Question2
{
    int findNumberOfUniqueCharacter(String myString)
    {
        int numberOfUniqueCharacters;
        char[] stringAsArray = myString.toLowerCase().toCharArray();
        Set<Character> setOfCharacters = new HashSet<>();
        for (char c : stringAsArray)
        {
            setOfCharacters.add(c);
        }
        numberOfUniqueCharacters = setOfCharacters.size();
        return numberOfUniqueCharacters;
    }

    public static void main(String[] args)
    {
        Question2 c = new Question2();
        String[] myStrings = {"Srishti", "Rahul", "aditi", "vishwajeet"};
        for (String s : myStrings)
        {
            System.out.println("Number of unique characters in " + s + ": "
                    + c.findNumberOfUniqueCharacter(s));
        }
    }
}