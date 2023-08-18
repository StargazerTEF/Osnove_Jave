package p18_08_2023;

import java.util.Scanner;

public class Zadatak11_vezbanje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite poziciju a:");
        int a = s.nextInt();

        System.out.println("Unesite poziciju b:");
        int b = s.nextInt();

        for (int i = 1; i <= 20; i++) {
            if (i >= a && i <= b) {
                System.out.print("_ ");
            } else {
                System.out.print("* ");
            }


        }
    }
}