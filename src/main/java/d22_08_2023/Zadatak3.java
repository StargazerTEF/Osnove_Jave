package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje
//arapsku vrednost sve dok korisnik ne unese KRAJ.
//
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.

        Scanner s = new Scanner(System.in);

        boolean end = false;

        int arapskiBroj = 0;

        while (!end) {
            System.out.print("Unesite rimski broj: ");
            String rimskiBroj = s.next();

            if (rimskiBroj.equals("I")) {
                arapskiBroj = 1;
                System.out.println("Arapski: " + arapskiBroj);
            }
            else if (rimskiBroj.equals("V")) {
                arapskiBroj = 5;
                System.out.println("Arapski: " + arapskiBroj);
            }
            else if (rimskiBroj.equals("X")) {
                arapskiBroj = 10;
                System.out.println("Arapski: " + arapskiBroj);
            }
            else if (rimskiBroj.equals("L")) {
                arapskiBroj = 50;
                System.out.println("Arapski: " + arapskiBroj);
            }
            else if (rimskiBroj.equals("C")) {
                arapskiBroj = 100;
                System.out.println("Arapski: " + arapskiBroj);
            }
            else if (rimskiBroj.equals("D")) {
                arapskiBroj = 500;
                System.out.println("Arapski: " + arapskiBroj);
            }
            else if (rimskiBroj.equals("M")) {
                arapskiBroj = 1000;
                System.out.println("Arapski: " + arapskiBroj);
            }
            else if (rimskiBroj.equals("KRAJ")) {
                end = true;
                System.out.println("Kraj programa.");
            }
        }
    }
}
