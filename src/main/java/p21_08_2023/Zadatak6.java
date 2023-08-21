package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj N: ");
        int brojN = s.nextInt();

        int suma = 0;

        for (int i = 1; i <= brojN ; i++) {
            System.out.println("Unesite broj:");
            int brojM = s.nextInt();

            suma = suma * 10 + brojM;
        }
        System.out.println("Rezultujuci broj je " + suma);
    }
}