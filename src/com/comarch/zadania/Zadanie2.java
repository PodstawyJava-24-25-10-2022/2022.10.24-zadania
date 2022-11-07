package com.comarch.zadania;

import java.util.Arrays;
import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Integer[] tab = new Integer[20];
        Random generator = new Random();
        for(int i = 0; i < 20; i++) {
            tab[i] = generator.nextInt(101);
            System.out.println(tab[i]);
        }

        int max = 0;
        for(int element : tab) {
            if(element > max) {
                max = element;
            }
        }
        System.out.println("Najwieksza liczba to: " + max);

        /*Arrays.sort(tab);
        for(int i = 0; i < 20; i++) {
            //tab[i] = generator.nextInt(101);
            System.out.println(tab[i]);
        }*/

    }
}
