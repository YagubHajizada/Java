package com.company.javaProjects;

public class Account {
    String name;
    String surname;
    String type;
    int number;
    int balance;
    Account(){

    }
    public Account(int number,int balance,String surname, String name, String type) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.type = type;
        this.balance = balance;
    }
}
