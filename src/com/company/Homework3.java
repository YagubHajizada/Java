package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet jūsu vārdu un uzvārds: ");
        String Name = scanner.next();
        String Surname = scanner.nextLine();
        scanner.close();
        String Yourname = Name.substring(0, 1).toUpperCase() + Name.substring(1);
        String Yoursurname = Surname.substring(Surname.lastIndexOf(" ") + 1).toUpperCase();

        System.out.println("jūs :" + Name + Surname);
        System.out.println("jūsu vārds : " + "\'" + Yourname + "\'");
        System.out.println("jūsu uzvārds : " + "\'" + Yoursurname + "\'");
    }
}
