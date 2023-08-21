package p21_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite petocifren broj:");
        int broj = s.nextInt();

        int noviBroj = 0;
        int x = 1;

        for (int i = 0; i < 5; i++) {
            noviBroj = broj / x % 10;
            System.out.print(noviBroj);
            x = x * 10;
        }
    }
}

