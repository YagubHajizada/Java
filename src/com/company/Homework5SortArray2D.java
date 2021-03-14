package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5SortArray2D {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("ievadiet 2D masīva 1.dimensijas izmēru (rindu skaitu): NO 5; Lidz15 ");
        int A = ran.nextInt(12) + 3;
        int N = sc.nextInt();
        int[][] array2D = new int[N][A];
        if (N >= 5 && N <= 15){
            sc.close();
            for( int i = 0; i < array2D.length; i++) {
                for(int j = 0; j < array2D[i].length; j++) {
                    array2D[i][j] = ran.nextInt(900) + 100;
                    System.out.printf("%5d", array2D[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < array2D.length; i++)
                Arrays.sort(array2D[i]);
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++)
                    System.out.printf("%5d", array2D[i][j]);
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < array2D[0].length; i++) {
                int t = array2D[0][i];
                array2D[0][i] = array2D[array2D.length-1][i];
                array2D[array2D.length-1][i] = t;
            }
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++)
                System.out.printf("%5d", array2D[i][j]);
            System.out.println();
        }
    }
}