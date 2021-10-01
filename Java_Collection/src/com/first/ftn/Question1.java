package com.first.ftn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Question1
{
    public static void main(String[] args)
    {
        float sumFromList = 0.0f;
        List<Float> floatList = new ArrayList<>();
        floatList.add(3.14f);
        floatList.add(2.71f);
        floatList.add(6.022f);
        floatList.add(13.7f);
        floatList.add(6.626f);

        ListIterator floatListIterator = floatList.listIterator();
        while (floatListIterator.hasNext())
        {
            sumFromList = sumFromList + (float) floatListIterator.next();
        }

        System.out.println("Iterating through Iterator:");
        Iterator floatIterator = floatList.iterator();

        while (floatIterator.hasNext())
        {
            System.out.println("Floating-point value: " + floatIterator.next());
        }

        System.out.println("Sum of floating-point values: " + sumFromList);
    }
}

