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
        System.out.println("Gracz 1 strzela:");
        plansza1.drukujPlansze();
        String strzal = scanner.next();
        if (plansza1.getPlansza(Ruch.wspI(strzal), Ruch.wspJ(strzal)) == 'S') {
            System.out.println("Trafiony!");
            plansza1.zaznaczTrafiony(Ruch.wspI(strzal), Ruch.wspJ(strzal));
        } else {
            System.out.println("Pudlo!");
            plansza1.zaznaczPudlo(Ruch.wspI(strzal), Ruch.wspJ(strzal));

        }



    }
}
