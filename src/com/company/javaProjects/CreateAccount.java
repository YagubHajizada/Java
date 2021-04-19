package com.company.javaProjects;

public class CreateAccount extends Account{

    CreateAccount(String name,String surname, int number,int balance ,String type){
        this.name=name;
        this.surname=surname;
        this.number=number;
        this.balance=balance;
        this.type=type;
    }
    CreateAccount(){
        super();
    }

    void insert(String surname, String name,int number,String type){// input user name, account number and type
        this.name=name;
        this.surname=surname;
        this.type=type;
        this.number=number; // generate random number
        this.balance=0;
    }

    void display_details(){
        System.out.println("Depositor Surname :" + surname);
        System.out.println("Depositor Name :" + name);
        System.out.println("Account Number : " + number);
        System.out.println("Account Balance : " + balance);
        System.out.println("Account Type : " + type);
    }

    void deposite(int number,int money){
        balance=money;
    }

    int withdraw(int withd){
        balance=balance-withd;
        return balance;
    }
}

