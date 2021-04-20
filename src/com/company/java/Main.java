package com.company.java;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Customer obj = new Customer(1,"Yagub","Hajizada", LocalDate.of(1993,9,18));
        obj.display();

        BankAccount bk = new BankAccount("Yagub","1");
        bk.showMenu();
    }
}