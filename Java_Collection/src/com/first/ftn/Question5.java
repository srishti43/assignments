package com.first.ftn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student
{    String firstName;
    double score;
    double age;
    public Student(String firstName, double score, double age)
    {
        this.firstName = firstName;
        this.score = score;
        this.age = age;
    }
}
class FirstNameComparator implements Comparator<Student>
{    @Override
    public int compare(Student s1, Student s2) {
        return s1.firstName.compareTo(s2.firstName);
    }
}
class ScoreComparator implements Comparator<Student>
{    @Override
    public int compare(Student s1, Student s2)
    {
        if (s1.score == s2.score)
            return new FirstNameComparator().compare(s1, s2);
        else
            return (int) (s1.score - s2.score);
    }
}
public class Question5
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Srishti", 89.9, 21));
        studentList.add(new Student("Rahul", 78.8, 23));
        studentList.add(new Student("Aditi", 86.5, 22));
        studentList.add(new Student("varnit", 89.9, 35));
        Collections.sort(studentList, new ScoreComparator());
        for (Student s : studentList)
            System.out.println(s.firstName + " is " + s.age + " and has scored " + s.score);
    }
}
