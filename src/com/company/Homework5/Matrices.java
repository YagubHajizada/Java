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
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rnd.nextInt(4) + 3;
        int[][] array = new int[n][n];
        System.out.println("Do you wish to fill array manualy? (yes - y ; no - n):");
        char mor = sc.next().charAt(0);
        switch(Character.toUpperCase(mor)) {
            case 'Y':
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.printf("Matrix [%d] [%d]", i, j);
                        array[i][j] = sc.nextInt();
                    }
                    System.out.println();
                }
                break;
            case 'N':
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = rnd.nextInt(100) + 1;
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Wrong input");
                return;
        }
        sc.close();
        for (int[] row : array){
            for (int column : row){
                System.out.printf("%5d", column);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == j){
                    System.out.printf("%5d", array[i][j]);
                }else{
                    System.out.printf("%5d",0);
                }
            }
            System.out.println();
        }
    }
}
