package com.company.Homework5;

import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
    public static void main(String[] args) {
        // Uzrakstīt programmu klasē "SortArray2D", kas
        // 1.) Pieprasa lietotājam ievadīt 2D masīva 1.dimensijas izmēru (rindu skaitu). Pieļaujamās ievades vērtības: 5 - 15 (Nepieciešams validēt lietotāja ievadi).
        // 2.) Izveido 2D masīvu, kuras pirmās dimensijas izmērs ir lietotāja ievadītais skaitlis, bet
        // otrās dimensijas izmērs tiek izvēlēts nejauši (Random) robežās no 4 līdz 15.
        // 3.) Aizpilda masīva elementus ar vērtībām - gadījuma skaitlīem robežās no 100 līdz 999
        // 4.) Izvada masīva vērtības tabulas veidā
        //5.) Veic katras rindas elementu kārtošanu dilstošā secībā
        // 6.) Apmaina masīva 1. rindu un pēdējo rindu ar vietām
        // 7.) Izvada izmainītā masīva vērtības tabulas veidā
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("ievadiet 2D masīva 1.dimensijas izmēru (rindu skaitu): NO 5; Lidz15 ");
        int A = ran.nextInt(12) + 3;
        int N = sc.nextInt();
        int[][] array2D = new int[N][A];
        if (N >= 5 && N <= 15) {
            sc.close();
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    array2D[i][j] = ran.nextInt(900) + 100;
                    System.out.printf("%5d", array2D[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    for (int k = 0; k < array2D[i].length - j - 1; k++) {
                        if (array2D[i][k] < array2D[i][k + 1]) {
                            int t = array2D[i][k];
                            array2D[i][k] = array2D[i][k + 1];
                            array2D[i][k + 1] = t;
                        }
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < array2D[0].length; i++) {
                int t = array2D[0][i];
                array2D[0][i] = array2D[array2D.length - 1][i];
                array2D[array2D.length - 1][i] = t;
            }
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++)
                System.out.printf("%5d", array2D[i][j]);
            System.out.println();
        }
    }
}
