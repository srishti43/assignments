package com.first.ftn;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Question8
{
    public static void main(String[] args)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMMM-yyyy");
        Calendar calendar = Calendar.getInstance();
        System.out.println("The date today: " + simpleDateFormat.format(calendar.getTime()));
    }
}