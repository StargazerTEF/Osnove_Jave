package p21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj N:");
        int brojN = s.nextInt();
        int y = 0;

        for (int i = 0; i < brojN ; i++) {
            System.out.println("Unesite broj:");
            int x = s.nextInt();

            if (x % 2 == 0) {
                y = y + 1;
            }
        }
        System.out.println("Broj unetih parnih brojeva je: \n" + y);
    }
}
