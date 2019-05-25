package com.sda.algorytmy;

import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Poczatek gry - tworzenie planszy
        Plansza plansza1 = new Plansza();
        plansza1.utworzPlansze();
        Plansza plansza2 = new Plansza();
        plansza2.utworzPlansze();

        //Ustawianie statkow
        Ruch.ustawianieStatkow(plansza1, scanner, 1);
        Ruch.ustawianieStatkow(plansza2, scanner, 2);


        //Strzelanie
        int trafieniaG1 = 0;
        int trafieniaG2 = 0;

        Ruch.strzelanie(plansza2, scanner, 1, trafieniaG1);
        Ruch.strzelanie(plansza1, scanner, 2, trafieniaG2);










//        System.out.println("Gracz " + gracz + " strzela:");
//        plansza1.drukujPlansze();
//        String strzal = scanner.next();
//        if (plansza2.getPlansza(Ruch.wspI(strzal), Ruch.wspJ(strzal)) == 'S') {
//            System.out.println("Trafiony!");
//            plansza2.zaznaczTrafiony(Ruch.wspI(strzal), Ruch.wspJ(strzal));
//            trafieniaG1++;
//            kolejka = false;
//        } else {
//            System.out.println("Pudlo!");
//            plansza2.zaznaczPudlo(Ruch.wspI(strzal), Ruch.wspJ(strzal));
//            kolejka = true;
//        }


    }
}
