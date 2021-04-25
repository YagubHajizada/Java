package com.company.BankAccaunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bank myBank = new Bank();

        int user_choice = 2;


        do {
            System.out.println();
            System.out.println("1) Open a new bank account");
            System.out.println("2) Deposit to a bank account");
            System.out.println("3) Withdraw to bank account");
            System.out.println("4) Print account balance");
            System.out.println("5) Quit");
            System.out.println();
            System.out.print("Enter choice [1-5]: ");
            user_choice = s.nextInt();
            switch (user_choice) {
                case 1:
                    System.out.println("Enter a customer name");
                    String cn = s.next();
                    System.out.println("Enter a opening balance");
                    double d = s.nextDouble();
                    System.out.println("Account was created and it has the following number: " + myBank.openNewAccount(cn, d));
                    break;
                case 2:
                    System.out.println("Enter a account number");
                    int an = s.nextInt();
                    System.out.println("Enter a deposit amount");
                    double da = s.nextDouble();
                    myBank.depositTo(an, da);
                    break;
                case 3:
                    System.out.println("Enter a account number");
                    int acn = s.nextInt();
                    System.out.println("Enter a withdraw amount");
                    double wa = s.nextDouble();
                    myBank.withdrawFrom(acn, wa);
                    break;
                case 4:
                    System.out.println("Enter a account number");
                    int anum = s.nextInt();
                    myBank.printAccountInfo(anum);
                    break;
                case 5:
                    System.out.println("Here are the balances " + "for each account:");
                case 6:
                    System.exit(0);
            }
        }
        while (user_choice != '6');
    }
}
