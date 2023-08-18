package p18_08_2023;

import java.util.Scanner;

public class Zadatak12_vezbanje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu videa u sekundama:");
        int duzinaVidea = s.nextInt();

        System.out.println("Unesite trenutno vreme u videu:");
        int trenutnoVremePregleda = s.nextInt();

        int procenatPregleda = trenutnoVremePregleda * 100 / duzinaVidea;

        for (int i = 1; i <=100 ; i++) {
            if (i <= procenatPregleda) {
                System.out.print("* ");
            } else {
                System.out.print("_ ");
            }

        }






    }
}
