package com.company;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet x:");
        int x = scanner.nextInt();
        System.out.println("ievadiet y:");
        int y = scanner.nextInt();
        scanner.close();
        if (x > -2 && x < 3 && y > -4 && y < 1) {
            System.out.println("Koordinātas" + "(" + x + ";" + y + ")" + "atrodas uz figūras iekšienē!");
        } else if (x >= -2 && y >= -4 && x <= 3 && y <= 1) {
            System.out.println("Koordinātas" + "(" + x + ";" + y + ")" + "atrodas uz figūras līnijas!");
        } else {
            System.out.println("Koordinātas" + "(" + x + ";" + y + ")" + "atrodas figūras ārpusē!");
        }
    }
}
