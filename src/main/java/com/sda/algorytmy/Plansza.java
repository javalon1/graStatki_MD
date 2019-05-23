package com.sda.algorytmy;

public class Plansza {
    char[][] plansza = new char[10][10];

    public char getPlansza(int i, int j) {
        return plansza[i][j];
    }


    public void utworzPlansze() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                plansza[i][j] = '0';
            }
        }
    }

    public void drukujPlansze() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) (65 + i) + " ");
            for (int j = 0; j < 10; j++) {
                //Wyjatek zeby nie drukowac statkow
                if (plansza[i][j] == 'S') {
                    System.out.print('0' + " ");
                } else {
                    System.out.print(plansza[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void drukujPlanszeStatki() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) (65 + i) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(plansza[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void zaznaczPudlo(int i, int j) {
        plansza[i][j] = '*';
    }

    public void zaznaczTrafiony(int i, int j) {
       plansza[i][j] = 'X';
   }

   public void ustawStatek(int i, int j) {
        plansza[i][j] = 'S';
    }

}



