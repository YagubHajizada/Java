package com.company.javaProjects;

import java.util.Scanner;

public class BankAccount {
    double balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname,String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(double amount) {
        if(amount != 0) {
            balance =balance + amount;
            double previousTransaction = - amount;
        }
    }

    void withdraw(double amount) {
        if(amount != 0) {
            balance = balance - amount;
            double previousTransaction = amount;
        }
    }

    void getPreviosTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }else if(previousTransaction < 0) {
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        }else {
            System.out.println("No transaction occured ");
        }
    }
    void showMenu() {

        char option ='\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is" + customerId);
        System.out.println("\n");
        System.out.println("A: Check balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit");

        do {
            System.out.println("******************************************************");
            System.out.println("Enter an option");
            System.out.println("******************************************************");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("------------------------------");
                    System.out.println("\n");
                    break;

                case'B' :
                    System.out.println("------------------------------");
                    System.out.println("Enter an amount to deposit: " );
                    System.out.println("------------------------------");
                    Double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case'C' :
                    System.out.println("------------------------------");
                    System.out.println("Enter an amount withdraw: ");
                    System.out.println("------------------------------");
                    Double amount2 = scanner.nextDouble();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case'D':
                    System.out.println("------------------------------");
                    getPreviosTransaction();
                    System.out.println("------------------------------");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Invalid Option!!! Please try again");
                    break;
            }

        } while (option != 'E');
        System.out.println("ThankYou for using our services");
    }
}
