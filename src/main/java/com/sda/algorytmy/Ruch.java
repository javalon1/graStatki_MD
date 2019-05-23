package com.sda.algorytmy;

public class Ruch {

    public static int wspolrzednaI(String strzal) {
        char wspolrzedne[] = strzal.toCharArray();
        int i;
        if (wspolrzedne.length == 2) {
            i = wspolrzedne[1] - 48;
        } else {
            i = 10;
        }
        return i;
    }

    public static int wspolrzednaJ(String strzal) {
        char wspolrzedne[] = strzal.toCharArray();
        int j = wspolrzedne[0] - 96;
        return j;
    }

}
