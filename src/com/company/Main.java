package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadīt Fārenheit: ");
        double F = scanner.nextDouble();
        scanner.close();
        System.out.println(F +"°F" + " " +"=" + " " + (5*(F - 32))/9 + "°C");
    }
}
