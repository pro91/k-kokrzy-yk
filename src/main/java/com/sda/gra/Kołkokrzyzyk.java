package com.sda.gra;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Kołkokrzyzyk {

    public static void main(String[] args) {
        System.out.println("***Gra kółko i krzyżyk!***\n");

        String[] plansza = {". ", ". ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};
        for (int i = 0; i < plansza.length; i++) {
            if (i == 2 || i == 5) {
                System.out.print(plansza[i]);
                System.out.println();
            } else {
                System.out.print(plansza[i]);
            }
        }
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int p = 1;
        for (int j = 0; j < plansza.length; j++) {
            while (plansza[j].contains(". ")) {
                boolean k = false;
                boolean l = false;
                do {
                    try {
                        System.out.println("\n\nGracz 1 - kołko - podaj miejsce od 1 do 9");
                        dodawanieO(plansza, scanner.nextInt());
                        k = true;
                    } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("Niepoprawna wartosc");
                        scanner.nextLine();
                    }
                }
                    while (!k);
                if(p == 5)
                    break;
                p++;
                    do {
                        try {

                                System.out.println("\n\nGracz 2 - krzyzyk - podaj miejsce od 1 do 9");
                                dodawanieX(plansza, scanner2.nextInt());
                                l = true;

                    } catch(InputMismatchException | ArrayIndexOutOfBoundsException e){
                        System.out.println("Niepoprawna wartosc");
                        scanner2.nextLine();
                    }
                } while (!l);
            }
        }
        System.out.println("\nRemis");
    }


    public static String[] dodawanieO(String[] plansza, int znak) {
        Scanner scanner = new Scanner(System.in);
        while (plansza[znak - 1] != ". ") {
            System.out.println("Podane pole jest juz zajete, sprobuj jeszcze raz");
            znak = scanner.nextInt();

        }
        plansza[znak - 1] = "O ";


        for (int i = 0; i < plansza.length; i++) {
            if (i == 2 || i == 5) {
                System.out.print(plansza[i]);
                System.out.println();
            } else {
                System.out.print(plansza[i]);
            }
        }

        if (plansza[0] == "O " && plansza[1] == "O " && plansza[2] == "O " || plansza[3] == "O " && plansza[4] == "O " && plansza[5] == "O "
                || plansza[6] == "O " && plansza[7] == "O " && plansza[8] == "O " || plansza[0] == "O " && plansza[3] == "O " && plansza[6] == "O "
                || plansza[0] == "O " && plansza[4] == "O " && plansza[8] == "O " || plansza[2] == "O " && plansza[4] == "O " && plansza[6] == "O "
                || plansza[1] == "O " && plansza[4] == "O " && plansza[7] == "O " || plansza[2] == "O " && plansza[5] == "O " && plansza[8] == "O ") {
            System.out.println("\nWygral gracz 1");
            System.exit(0);
        }
        return plansza;
    }

    public static String[] dodawanieX(String[] plansza, int znak2) {
        Scanner scanner = new Scanner(System.in);
        while (plansza[znak2 - 1] != ". ") {
            System.out.println("Podane pole jest juz zajete, sprobuj jeszcze raz");
            znak2 = scanner.nextInt();

        }
        plansza[znak2 - 1] = "X ";

        for (int i = 0; i < plansza.length; i++) {
            if (i == 2 || i == 5) {
                System.out.print(plansza[i]);
                System.out.println();
            } else {
                System.out.print(plansza[i]);
            }
        }
        if (plansza[0] == "X " && plansza[1] == "X " && plansza[2] == "X " || plansza[3] == "X " && plansza[4] == "X " && plansza[5] == "X "
                || plansza[6] == "X " && plansza[7] == "X " && plansza[8] == "X " || plansza[0] == "X " && plansza[3] == "X " && plansza[6] == "X "
                || plansza[1] == "X " && plansza[4] == "X " && plansza[7] == "X " || plansza[2] == "X " && plansza[5] == "X " && plansza[8] == "X "
                || plansza[0] == "X " && plansza[4] == "X " && plansza[8] == "X " || plansza[2] == "X " && plansza[4] == "X " && plansza[6] == "X ") {
            System.out.println("\nWygral gracz 2");
            System.exit(0);
        }
        return plansza;
    }
}
