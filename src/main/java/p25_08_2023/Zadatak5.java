package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int m = s.nextInt();

        for (int i = 0; i < m; i++) {
            stars(i + 1);
        }
    }
    public static void stars (int number) {

        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
            System.out.println();
    }
}
