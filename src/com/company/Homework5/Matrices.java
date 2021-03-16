package com.company.Homework5;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //  Uzrakstit programmu klasē "Matrices", kas
        // 1.) Nejauši izvēlās veselo skaitli N robežās no 3 līdz 6
        //  2.) Izveido 2D masīvu izmērā NxN (N rindas un N kolonnas)
        //  3.) Pieprasa no lietotāja veikt izvēli:
        //  A. Aizpildīt masīva elementa vērtības manuāli
        //  B. Aizpildīt masīva elementa vērtības nejauši (ar skaitļiem no 1 līdz 100)
        // 4.)* Ja lietotājs izvēlās A iespēju: lietotājs pats ievada katra masīva elementa vērtību, piemēram:
// masivs[0][0] = 2
// masivs[0][1] = 23
// masivs[0][2] = 44
// masivs[1][0] = 35
//...utt. līdz tiek ievadītas visas masīvu elementu vērtības
// * Ja lietotājs izvēlās B iespēju: masīva elementi tiek aizpildīti ar gadījuma (Random) vērtībā robežās no 1 līdz 100.
//  5.) Masīvs tiek izvadīts uz ekrāna tabulas veidā
//  6.) Masīvs tiek pārvērsts par diagonāles matricu - visas elementu vērtības, izņemot galvenās diagonāles vērtības, tiek pārvērstas par 0.
// Hint: Diagonāles elementus var identificēt, kur elementa abu dimensiju indeksi ir vienādi (array[0][0]...array[1][1]... utt.)
// Info par diagonāles matricām: https://en.wikipedia.org/wiki/Diagonal_matrix
// 7.) Pārveidotais masīvs tiek izvadīts uz ekrāna tabulas veidā
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int N = ran.nextInt(4) + 3;
        int[][] array2D = new int[N][N];
        System.out.println("izvēlieties aizpildīt masīva elementa vērtības :" + "Manual: 'M'" + " Random: 'R'");
        char next = sc.next().charAt(0);
        if (next == 'M') {
            System.out.println("Ievadiet ludzu katram masīva elementa vērtību:");
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    array2D[i][j] = sc.nextInt();
                    System.out.println("arr[" + i + "][" + j + "] = " + array2D[i][j]);
                }
                System.out.println();
            }
            sc.close();
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    System.out.printf("%5d", array2D[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%5d", array2D[i][j]);
                    } else {
                        System.out.printf("%5d", 0);
                    }
                }
                System.out.println();
            }
        } else if (next == 'R') {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D.length; j++) {
                    array2D[i][j] = ran.nextInt(100) + 1;
                    System.out.println("arr[" + i + "][" + j + "] = " + array2D[i][j]);
                }
                System.out.println();
            }
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    System.out.printf("%5d", array2D[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%5d", array2D[i][j]);
                    } else {
                        System.out.printf("%5d", 0);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Mēģini vēlreiz! ");

        }
    }
}
