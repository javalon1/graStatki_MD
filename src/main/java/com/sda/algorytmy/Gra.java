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
        boolean ruch = true;
        while (trafieniaG1 < 20 || trafieniaG2 < 20) {
            if (ruch) {
                Ruch.strzelanie(plansza2, scanner, 1, trafieniaG1, ruch);
            } else {
                Ruch.strzelanie(plansza1, scanner, 2, trafieniaG2, ruch);
            } ruch = !ruch;
        }
    }
}
