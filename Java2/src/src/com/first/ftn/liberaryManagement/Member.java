package com.first.ftn.liberaryManagement;

public class Member implements Person {
    String memberName;
    int memberID;

    Member(String name, int id) {
        memberName = name;
        memberID = id;
    }

    // Interface method definition
    public void getPerson() {
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberID);
    }

}