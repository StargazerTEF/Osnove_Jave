package p24_08_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();

        System.out.print("Unesite koliko brojeva zelite da niz ima: ");
        int velicinaNiza = s.nextInt();

        for (int i = 0; i < velicinaNiza; i++) {
            System.out.print("Ucitajte " + (i + 1) + ". element niza: ");
            int x = s.nextInt();
            brojevi.add(x);
        }
            System.out.println("Niz je:");
            for (int i = 0; i < brojevi.size(); i++) {
                System.out.print(brojevi.get(i) + ", ");
            }
        }
    }
