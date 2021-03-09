package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        boolean b = false;
        int n = 0;
        while (!b) {
            System.out.print("ludzu ievadiet masiva izmeru robežās no 20 līdz 40: ");
            n = scanner.nextInt();
            if (n >= 20 && n <= 40) {
                b = true;
                scanner.close();
            } else {
                System.out.println("Jūsu numurs nav masiva izmeru robežās no 20 līdz 40:");
            }
        }
        int[] array = new int[n];
        for (int x = 0; x < array.length; x++) {
            array[x] = ran.nextInt(90) + 10;
        }
        System.out.println("RndArray : " + Arrays.toString(array));
        for (int x = 0; x < array.length; x++) {
            for (int j = 1; j < (array.length - x); j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("SortArray : " + Arrays.toString(array));
    }
}
