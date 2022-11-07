package com.comarch.zadania;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[20];
        for(int i = 1; i < 21; i++) {
            tab[i-1] = i*2;
        }

        for(int i = 0; i < 20; i++) {
            System.out.println(tab[i]);
        }
    }
}
