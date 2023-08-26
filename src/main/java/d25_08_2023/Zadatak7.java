package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int a = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = s.nextInt();
        System.out.print("Unesite treci broj: ");
        int c = s.nextInt();

        int x = findSmallestNumber(a, b, c);
        System.out.println("Ako se proslede brojevi " + a + ", " + b + ", " + c + " u poziv metode, metoda vraca " + x);

    }
    public static int findSmallestNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else {
            return 0;    // ako se unesu isti brojevi
        }
    }
}