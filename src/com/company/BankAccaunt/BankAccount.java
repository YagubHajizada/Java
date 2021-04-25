package com.company.BankAccaunt;

public class BankAccount {
    private int accountNum;
    private String customerName;
    private double balance;
    private  static int noOfAccounts=0;

    public String getAccountInfo(){
        return "Account number: " + accountNum + "\nCustomer Name: " + customerName + "\nBalance:" + balance +"\n";
    }


    public BankAccount(String abc, double xyz){
        customerName = abc;
        balance = xyz;
        noOfAccounts ++;
        accountNum = noOfAccounts;
    }

    public int getAccountNum(){
        return accountNum;
    }
    public void deposit(double amount){

        if (amount<=0) {
            System.out.println("Amount to be deposited should be positive");
        } else {
            balance = balance + amount;

        }
    }
    public void withdraw(double amount)
    {
        if (amount<=0){
            System.out.println("Amount to be withdrawn should be positive");
        }
        else
        {
            if (balance < amount) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;

            }
        }
    }
}
