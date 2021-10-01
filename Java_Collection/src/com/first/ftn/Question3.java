package com.first.ftn;
import java.util.*;
public class Question3
{
    void findOccurrenceOfCharacters(String myString)
    {
        System.out.println("Input string: " + myString);
        char[] stringAsArray = myString.toLowerCase().toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char c : stringAsArray)
            characterList.add(c);
        Map<Character, Integer> characterFrequencyMap = new LinkedHashMap<>();
        for (Character c : characterList)
        {
            characterFrequencyMap.put(c, Collections.frequency(characterList, c));
        }
        for (Map.Entry m : characterFrequencyMap.entrySet())
        {
            System.out.println(m.getKey() + " occurs " + m.getValue() + " time(s)");
        }
    }
    public static void main(String[] args) {
        Question3 occurrenceOfCharacter = new Question3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String myString = sc.nextLine();
        occurrenceOfCharacter.findOccurrenceOfCharacters(myString);
    }
}