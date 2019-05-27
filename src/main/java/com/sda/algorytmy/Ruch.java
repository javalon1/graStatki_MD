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
        for (int i = 0; i < 2; i++) {
            String statek = scanner.next();
            plansza.ustawStatek(Ruch.wspI(statek), Ruch.wspJ(statek));

        }
    }

    public static void strzelanie(Plansza plansza, Scanner scanner, int gracz, int trafienia, boolean ruch) {
        while (true) {
            System.out.println("Gracz " + gracz + " strzela:");
            plansza.drukujPlansze();
            String strzal = scanner.next();
            if (plansza.getPlansza(Ruch.wspI(strzal), Ruch.wspJ(strzal)) == 'S') {
                System.out.println("Trafiony!");
                System.out.println();
                plansza.zaznaczTrafiony(Ruch.wspI(strzal), Ruch.wspJ(strzal));
                trafienia++;
                if (trafienia == 2){
                    plansza.drukujPlansze();
                    System.out.println("Bum! Wygrales!!! ");
                    System.exit(0);
                }
            } else {
                System.out.println("Pudlo!");
                System.out.println();
                plansza.zaznaczPudlo(Ruch.wspI(strzal), Ruch.wspJ(strzal));
                ruch = !ruch;
                break;
                }

            }
        }
    }


