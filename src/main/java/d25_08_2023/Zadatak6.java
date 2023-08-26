package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//Napisati funkciju koja pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj M: ");
        int m = s.nextInt();
        System.out.print("Unesite broj N: ");
        int n = s.nextInt();

        int x = izbroji(m, n);
        System.out.println("Izmedju brojeva " + m + " i " + n + " ima " + x + " celih brojeva.");
    }
    public static int izbroji (int m, int n) {
        int counter = 0;
        for (int i = m + 1; i < n; i++) {
            counter++;
        }
        return counter;
    }
}
