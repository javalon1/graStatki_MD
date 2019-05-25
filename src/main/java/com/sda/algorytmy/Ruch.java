package com.sda.algorytmy;

import java.util.Scanner;

public class Ruch {



    public static int wspJ(String strzal) {
        char wspolrzedne[] = strzal.toCharArray();
        int j;
        if (wspolrzedne.length == 2) {
            j = wspolrzedne[1] - 49;
        } else {
            j = 10;
        }
        return j;
    }

    public static int wspI(String strzal) {
        char wspolrzedne[] = strzal.toCharArray();
        int i = wspolrzedne[0] - 97;
        return i;
    }

    public static void ustawianieStatkow(Plansza plansza, Scanner scanner, int gracz) {
        System.out.println("Gracz " + gracz + " - Rozstaw swoje statki:");
        plansza.drukujPlansze();
        for (int i = 0; i < 4; i++) {
            String statek = scanner.next();
            plansza.ustawStatek(Ruch.wspI(statek), Ruch.wspJ(statek));

        }
    }

    public static void strzelanie(Plansza plansza, Scanner scanner, int gracz, int trafienia) {
        while (true) {
            System.out.println("Gracz " + gracz + " strzela:");
            plansza.drukujPlansze();
            String strzal = scanner.next();
            if (plansza.getPlansza(Ruch.wspI(strzal), Ruch.wspJ(strzal)) == 'S') {
                System.out.println("Trafiony!");
                plansza.zaznaczTrafiony(Ruch.wspI(strzal), Ruch.wspJ(strzal));
                trafienia++;
                if (trafienia == 4){
                    System.out.println("Bum! Wygrales!!! ");
                }
            } else {
                System.out.println("Pudlo!");
                plansza.zaznaczPudlo(Ruch.wspI(strzal), Ruch.wspJ(strzal));
                break;
            }
        }
    }
}

